package com.zaravya.sample.controller;

import com.zaravya.sample.common.AppProperties;
import com.zaravya.sample.dto.Greeting;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CpsApiController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

    private static final String template = "Hello Docker, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
    @Autowired
    private ProducerTemplate producer;

    @Autowired
    private CamelContext camelContext;
    */

    @Autowired
	AppProperties appProperties;

    @Autowired
    RestHandler restHandler;

    @Autowired
    SoapHandler soapHandler;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = "/cps/process-request")
    @ResponseBody
    public ResponseEntity<?> processRequest(final HttpServletRequest request) {
        // final Exchange requestExchange = ExchangeBuilder.anExchange(camelContext).withBody(requestBody).build();
        // final Exchange responseExchange = producer.send(appProperties.getRedirectServiceEndpoint(), requestExchange);
        // final String responseBody = responseExchange.getMessage().getBody(String.class);

        try {
            /* Note: our rest handler won't process
            * multipart, binary, other complex content type
             */
            String contentType = request.getContentType();
            String requestBody = IOUtils.toString(request.getReader());
            log.info("Content Type {}", request.getContentType());
            log.info("Request Body {}", requestBody);

            if (StringUtils.isEmpty(contentType)) {
                log.info("Empty Content type unable to redirect");
                return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("Content type not found");
            } else if (contentType.contains("xml")) {
                log.info("SOAP Request");
                return soapHandler.handleRequest(request, requestBody);
            } else {
                log.info("Other Request");
                return restHandler.handleRequest(request, requestBody);
            }
        } catch (Throwable t) {
            t.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(t.getMessage());
        }
    }
}

package com.zaravya.sample.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.zaravya.sample.common.AppProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.xml.soap.*;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;

@Component
public class SoapHandler {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AppProperties appProperties;

    public ResponseEntity<?> handleRequest(HttpServletRequest request, String requestBody) throws Throwable {
        SOAPMessage message = MessageFactory.newInstance().createMessage(null,
                new ByteArrayInputStream(requestBody.getBytes())
        );

        SOAPPart soappart = message.getSOAPPart();
        SOAPEnvelope incomingEnvelope = soappart.getEnvelope();
        SOAPBody body = incomingEnvelope.getBody();

        DOMSource source = new DOMSource(body);
        StringWriter stringResult = new StringWriter();
        TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(stringResult));
        String bodyToString = stringResult.toString();

        log.info("BodyToString => {}", bodyToString);

        XmlMapper xmlMapper = new XmlMapper();
        JsonNode rootNode = xmlMapper.readTree(bodyToString);
        // TODO: parse xml

        return ResponseEntity.status(HttpStatus.OK).body(bodyToString);
    }
}

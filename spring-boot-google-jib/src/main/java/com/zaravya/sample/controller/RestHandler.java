package com.zaravya.sample.controller;

import com.zaravya.sample.common.AppProperties;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Component
public class RestHandler {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AppProperties appProperties;

    public ResponseEntity<?> handleRequest(HttpServletRequest request, String requestBody) throws Exception {
        // TODO: transform request
        /*
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("https://google.com"));
        return new ResponseEntity<>(requestBody, headers, HttpStatus.MOVED_PERMANENTLY);
        */

        Map<String, String[]> map = request.getParameterMap();
        for (String key : map.keySet()) {
            log.info("Key => {}, value = {}", key, map.get(key));
        }

        // return the request what we get
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(map.isEmpty() ? requestBody : map);
    }
}

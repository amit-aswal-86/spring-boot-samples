package com.example.demo.service.impl;

import com.example.demo.service.HelloService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@WebService(serviceName = "HelloService", portName = "HelloPort",
        targetNamespace = "http://service.demo.example.com/",
        endpointInterface = "com.example.demo.service.HelloService")
public class HelloServiceImpl implements HelloService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public String sayHello(String name) {
        logger.info("Executing operation sayHello" + name);
        return "Hello " + name + ", Welcome to CXF RS Spring Boot World!!!";
    }

}

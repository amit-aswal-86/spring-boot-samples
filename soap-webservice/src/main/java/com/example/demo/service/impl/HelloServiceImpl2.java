package com.example.demo.service.impl;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl2 implements HelloService {

    public String sayHello(String a) {
        return "Hello2 " + a + ", Welcome to CXF RS Spring Boot World!!!";
    }

}

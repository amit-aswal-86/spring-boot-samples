package com.example.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://service.demo.example.com/", name = "Hello")
public interface HelloService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHello",
            targetNamespace = "http://service.demo.example.com/",
            className = "com.example.demo.service.SayHello")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(localName = "sayHelloResponse",
            targetNamespace = "http://service.demo.example.com/",
            className = "com.example.demo.service.SayHelloResponse")
    public String sayHello(@WebParam(name = "name", targetNamespace = "") String name);
}

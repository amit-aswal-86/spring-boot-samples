# Getting Started

This sample project demonstrates how to use **CXF Web Services** with **Spring Boot**.
The sample uses **Gradle**. It can be built and run from the command line:
```
./gradlew bootRun
```

http://localhost:8080/services/hello?wsdl will now display the generated WSDL.

# Spring Boot CXF JAX-WS Starter
[Documentation](https://cxf.apache.org/docs/springboot.html)     
Registers CXFServlet with a  "/services/*" URL pattern for serving CXF JAX-WS endpoints.    
[Sample on github](https://github.com/apache/cxf/tree/master/distribution/src/main/release/samples/jaxws_spring_boot)  

Use "cxf.path" property to customize a CXFServlet URL pattern  
Use "cxf.servlet.init" map property to customize CXFServlet properties such as "services-list-path" (available by default at  "/services"), etc.

## Examples
[Spring Boot & Apache CXF – How to SOAP in 2016](https://blog.codecentric.de/en/2016/02/spring-boot-apache-cxf/)    
[A Guide to Apache CXF with Spring](http://www.baeldung.com/apache-cxf-with-spring)  
[Apache CXF - Spring Boot SOAP Web Service Client Server Example](https://www.codenotfound.com/apache-cxf-spring-boot-soap-web-service-client-server-example.html)  

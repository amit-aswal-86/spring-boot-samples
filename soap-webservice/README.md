# Getting Started

This sample project demonstrates how to use **CXF Web Services** with **Spring Boot**.
The sample uses **Gradle**. It can be built and run from the command line:
```
./gradlew bootRun
```

http://localhost:8080/services/hello?wsdl will now display the generated WSDL.

#### Test in postman
* Enter the SOAP endpoint as the request URL (http://localhost:8080/services/hello?wsdl) in Postman.
* Set the request method to POST.
* Under the Body tab, set the body type to raw and select XML (text/xml) from the dropdown. This will automatically add the correct Content-Type header as can be seen under the Headers tab. While REST typically uses JSON and other data formats, SOAP relies on XML.
* In the request body, define the SOAP envelope, body, and header tags. Start with the the required SOAP envelope tag and define all the namespaces. Enter the SOAP body and headers. The name of the SOAP method (operation) should be specified in the SOAP body, for example:
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:q0="http://service.demo.example.com/">
 <soapenv:Body>
     <q0:sayHello xmlns:q0="http://service.demo.example.com/">
		<name>Amit Aswal The Great</name>
	</q0:sayHello>
 </soapenv:Body>
</soapenv:Envelope>
```
* Below the response
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
    <soap:Body>
        <ns2:sayHelloResponse xmlns:ns2="http://service.demo.example.com/">
            <return>Hello Amit Aswal The Great, Welcome to CXF RS Spring Boot World!!!</return>
        </ns2:sayHelloResponse>
    </soap:Body>
</soap:Envelope>
``` 

 

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

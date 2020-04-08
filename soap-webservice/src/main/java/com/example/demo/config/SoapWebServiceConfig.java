package com.example.demo.config;

import com.example.demo.service.impl.HelloServiceImpl1;
import com.example.demo.service.impl.HelloServiceImpl2;
import org.apache.cxf.Bus;
import javax.xml.ws.Endpoint;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class SoapWebServiceConfig {

    @Autowired
    private Environment environment;

    @Autowired
    @Qualifier(Bus.DEFAULT_BUS_ID)
    private Bus springBus;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean
    public Bus bus() {
        if (this.environment.getProperty("logging.soap.enabled", Boolean.class)) {
            this.springBus.setFeatures(new ArrayList<>(Arrays.asList(loggingFeature())));
            logger.info("enabling logging of SOAP messages");
        }
        return this.springBus;
    }

    @Bean
    public LoggingFeature loggingFeature() {
        LoggingFeature loggingFeature = new LoggingFeature();
        loggingFeature.setPrettyLogging(true);
        return loggingFeature;
    }

    @Bean
    public Endpoint helloServiceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus(), new HelloServiceImpl1());
        String addr = "/hello";
        endpoint.publish(addr);
        logger.info("publishing HelloService on " + addr);
        return endpoint;
    }

    @Bean
    public Endpoint helloServiceEndpoint2() {
        EndpointImpl endpoint = new EndpointImpl(bus(), new HelloServiceImpl2());
        String addr = "/hello2";
        endpoint.publish(addr);
        logger.info("publishing HelloServiceImpl2 on " + addr);
        return endpoint;
    }
}

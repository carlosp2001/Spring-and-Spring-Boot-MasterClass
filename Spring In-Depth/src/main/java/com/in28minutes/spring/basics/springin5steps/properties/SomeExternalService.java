package com.in28minutes.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;

public class SomeExternalService {
    // from property file
    // external service url
    @Value("external.service.url")
    private String url;

    public String returnServiceURL() {
        return url;
    }
}

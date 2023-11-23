package com.example.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Currency;
import java.util.List;

// http://localhost:8080/courses
/*
Course: id, name, author
[
    {
        "id": 1,
        "name": "Learn AWS",
        "author": "Carlos Pineda"
    }
]
 */

@RestController
public class CurrencyConfigurationController {
    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return configuration;
    }

}

package com.in28minutes.spring.basics.springin5steps.cdi;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Si la versión de Spring Boot es 3,debemos utilizar jakart.inject en vez
// de javax.inject
@Named // A cambio de usar @Component podemos usar @Named
public class SomeCdiBusiness {
    @Inject
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[] data = someCdiDao.getData();
        for (int value: data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
}

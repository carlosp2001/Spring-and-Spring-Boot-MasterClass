package com.in28minutes.spring.basics.springin5steps.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Load the context
// Se carga el contexto para poder correr y buscar los beans necesarios
@ExtendWith(MockitoExtension.class)
class SomeCdiBusinessTest {
    // Get this bean from context
    @Autowired
     SomeCdiBusiness business;
    @Test
    public void testBasicScenario() {
        // call method on binarySearch
        int actualResult = business.findGreatest();
        // check if the value is correct
        assertEquals(100, actualResult);
    }
}
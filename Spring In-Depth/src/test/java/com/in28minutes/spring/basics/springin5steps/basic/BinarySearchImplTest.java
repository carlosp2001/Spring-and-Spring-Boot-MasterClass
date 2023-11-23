package com.in28minutes.spring.basics.springin5steps.basic;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

// Load the context
// Se carga el contexto para poder correr y buscar los beans necesarios
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
class BinarySearchImplTest {
    // Get this bean from context
    @Autowired
    BinarySearchImpl binarySearch;
    @Test
    public void testBasicScenario() {
        // call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[]{}, 5);
        // check if the value is correct
        assertEquals(3, actualResult);
    }
}
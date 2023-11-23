package com.in28minutes.junit;


import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {
    @BeforeAll // BeforeAll se ejecuta antes de comenzar todas las pruebas unitarias,
        // debe ser static method
    static void beforeAll() {
        System.out.println("BeforeALl");
    }

    @BeforeEach // BeforeEach se ejecuta antes de cada prueba
    void beforeEach(){
        System.out.println("BeforeEach");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test3(){
        System.out.println("test3");
    }

    @AfterEach
        // AfterEach se ejecuta después de cada prueba
    void afterEach(){
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

}

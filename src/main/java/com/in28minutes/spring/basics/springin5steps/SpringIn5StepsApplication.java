package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

    // La idea de loose coupling es que los componentes dependan lo menos de otro
    // componente, este es un ejemplo claro
    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
        // Ahora binary search es independiente del sortAlgorithm, puedes
        // crear un nuevo algoritmo y puedes iniciar usando BinarySearchImpl. Entonces
        // SortAlgorithm es una dependencia de BinarySearch

        int result = binarySearch.binarySearch(new int[]{124, 6}, 3);
        System.out.println(result);

        SpringApplication.run(SpringIn5StepsApplication.class, args);
    }

}

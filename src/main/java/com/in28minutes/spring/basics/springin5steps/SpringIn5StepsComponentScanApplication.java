package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan") // Si al momento de escanear no
// encontramos beans en el package debemos manualmente realizar un escaneo de componentes
public class SpringIn5StepsComponentScanApplication {
    /*
    Para un mejor uso de Spring, necesitamos especificar 3 cosas
    1- Cuáles son los beans?
    R/ BinarySearchImpl, BubbleSortAlgorithm
    2- Cuáles son las dependencias de un bean?
    R/ SortAlgorithm
    3- Donde buscar los beans?
     */
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

    // La idea de loose coupling es que los componentes dependan lo menos de otro
    // componente, este es un ejemplo claro
    public static void main(String[] args) {
        // Ahora binary search es independiente del sortAlgorithm, puedes
        // crear un nuevo algoritmo y puedes iniciar usando BinarySearchImpl. Entonces
        // SortAlgorithm es una dependencia de BinarySearch


        // Application Context
//        BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());

        /*
        BEAN SCOPE
        Default - singleton
        singleton - one instance per string context
        prototype - New bean whenever requested
        request - One bean per HTTP request
        session - One bean per HTTP session
         */

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);

        ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDao);
        LOGGER.info("{}", componentDao.getJdbcConnection());

    }

}

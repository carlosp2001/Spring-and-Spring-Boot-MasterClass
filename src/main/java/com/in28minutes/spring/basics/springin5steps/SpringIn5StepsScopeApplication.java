package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsScopeApplication {
    /*
    Para un mejor uso de Spring, necesitamos especificar 3 cosas
    1- Cuáles son los beans?
    R/ BinarySearchImpl, BubbleSortAlgorithm
    2- Cuáles son las dependencias de un bean?
    R/ SortAlgorithm
    3- Donde buscar los beans?
     */
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

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

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbcConnection());

        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbcConnection());
    }

}

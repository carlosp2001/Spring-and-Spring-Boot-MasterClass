package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXMLContextApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            LOGGER.info("Beans Loaded ->  {}", (Object)applicationContext.getBeanDefinitionNames());

            XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
            System.out.println(personDao);
            System.out.println(personDao.getXmlJdbcConnection());
        }
    }
}

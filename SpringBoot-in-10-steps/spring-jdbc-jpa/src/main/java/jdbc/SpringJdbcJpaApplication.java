package jdbc;//package com.example.springjdbcjpa;

import com.example.springjdbcjpa.entity.Person;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringJdbcJpaApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
    PersonJdbcDao dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users -> {}", dao.findAll());
        logger.info("User id 10002 -> {}", dao.findById(10002));
        logger.info("Deleting 10001 -> No of Rows Deleted {}", dao.deleteById(10001));
        logger.info("All users -> {}", dao.findAll());
        logger.info("Inserting 10004 -> {}",
                dao.insert(new Person(10004, "Tara", "Berlin", new Date())));
        logger.info("Updating 10004 -> {}",
                dao.update(new Person(10004, "Taras", "Paris", new Date())));
        logger.info("All users -> {}", dao.findAll());
    }
}

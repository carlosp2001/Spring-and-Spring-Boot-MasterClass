package com.example.springjdbcjpa;

import com.example.springjdbcjpa.entity.Person;
import com.example.springjdbcjpa.jpa.PersonJpaRepository;
import com.example.springjdbcjpa.springdata.PersonSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonSpringDataRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User id 10002 -> {}", repository.findById(10002));
        logger.info("Inserting 10004 -> {}",
               repository.save(new Person(10004, "Tara", "Berlin", new Date())));
        logger.info("Updating 10004 -> {}",
                repository.save(new Person(10004, "Taras", "Paris", new Date())));
        repository.deleteById(10002);
        logger.info("All users -> {}", repository.findAll());



//        logger.info("All users -> {}", dao.findAll());
//        logger.info("Deleting 10001 -> No of Rows Deleted {}", dao.deleteById(10001));
//        logger.info("All users -> {}", dao.findAll());
//        logger.info("Inserting 10004 -> {}",
//                dao.insert(new Person(10004, "Tara", "Berlin", new Date())));
//        logger.info("Updating 10004 -> {}",
//                dao.update(new Person(10004, "Taras", "Paris", new Date())));
//        logger.info("All users -> {}", dao.findAll());
    }
}

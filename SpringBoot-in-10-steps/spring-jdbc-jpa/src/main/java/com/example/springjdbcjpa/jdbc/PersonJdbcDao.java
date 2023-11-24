package com.example.springjdbcjpa.jdbc;

import com.example.springjdbcjpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // @Repository es la anotación correcta cuando necesitamos contactarnos
// con la base de datos
public class PersonJdbcDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    // select * from person
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person",
                new BeanPropertyRowMapper(Person.class));
    }
}

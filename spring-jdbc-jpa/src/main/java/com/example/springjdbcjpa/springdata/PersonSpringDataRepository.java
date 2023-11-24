package com.example.springjdbcjpa.springdata;

import com.example.springjdbcjpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

// Haciendo uso de herencia de JpaRepository para poder utilizar los mismos métodos
public interface PersonSpringDataRepository extends JpaRepository <Person, Integer> {

}

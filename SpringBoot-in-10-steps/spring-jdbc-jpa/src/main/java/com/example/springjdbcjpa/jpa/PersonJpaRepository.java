package com.example.springjdbcjpa.jpa;

import com.example.springjdbcjpa.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

// Repository
@Repository
// Transaction Management
@Transactional
public class PersonJpaRepository {
    // Connect to database
    @PersistenceContext
    EntityManager entityManager;

    /**
     * Método JPA para encontrar un registro por medio de un id
     *
     * @param id
     * @return
     */
    public Person findById(int id) {
        return entityManager.find(Person.class, id); // JPA
    }

    public Person insert(Person person) {
        return entityManager.merge(person); // Si se desea insertar o actualizar un registro debemos utilizar
        // merge, si el método ya existe sobreescribira el registro de lo contrario lo creará
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }
}

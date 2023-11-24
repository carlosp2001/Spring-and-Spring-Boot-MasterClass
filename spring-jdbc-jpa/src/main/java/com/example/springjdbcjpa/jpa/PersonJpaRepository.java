package com.example.springjdbcjpa.jpa;

import com.example.springjdbcjpa.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

// Repository
@Repository
// Transaction Management
@Transactional
public class PersonJpaRepository {
    // Connect to database
    @PersistenceContext
    EntityManager entityManager;

    public List<Person> findAll() {
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();

    }

    /**
     * Método JPA para encontrar un registro por medio de un id
     *
     * @param id
     * @return
     */
    public Person findById(int id) {
        return entityManager.find(Person.class, id); // JPA
    }

    /**
     * Método para insertar un nuevo registro en persona usando JPA
     * @param person
     * @return
     */
    public Person insert(Person person) {
        return entityManager.merge(person); // Si se desea insertar o actualizar un registro debemos utilizar
        // merge, si el método ya existe sobreescribira el registro de lo contrario lo creará
    }

    /**
     * Método para actualizar un registro usando JPA
     * @param person
     * @return
     */
    public Person update(Person person) {
        return entityManager.merge(person);
    }

    /**
     * Método para eliminar un registro de persona usando JPA
     * @param id
     */
    public void delete(int id) {
        Person person = findById(id);
        entityManager.remove(person);
    }
}

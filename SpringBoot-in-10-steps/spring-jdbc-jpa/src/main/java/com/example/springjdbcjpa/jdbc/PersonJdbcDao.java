package com.example.springjdbcjpa.jdbc;

import com.example.springjdbcjpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository // @Repository es la anotación correcta cuando necesitamos contactarnos
// con la base de datos
public class PersonJdbcDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * Row mapper para personalizar la obtención de datos para el modelo Persona
     */
    class PersonRowMapper implements RowMapper<Person> {
        // Los row mappers nos ayudan en el caso de que las columnas en las tablas sean muy diferentes a como lo
        // tenemos definido en nuestro modelo
        // En este caso podemos buscar vincular cada campo de fila
        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirthDate(rs.getTimestamp("birth_date"));
            return person;
        }
    }

    /**
     * Método para retornar todos los registros de personas
     * @return
     */
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person",
                new PersonRowMapper());
    }

    /**
     * Método en el Data Access Object para encontrar un id
     * @param id
     * @return
     */
    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?",
                new Object[]{id},
                new BeanPropertyRowMapper<Person>(Person.class));
    }

    /**
     * Método en el DAO para eliminar un id
     * @param id
     * @return
     */
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from person where id=?",
                new Object[]{id});
    }

    /**
     * Método en el DAO para insertar una nueva persona
     * @param person
     * @return
     */
    public int insert(Person person) {
        return jdbcTemplate.update(
                "INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE) " +
                        "VALUES (?, ?, ?, ?)",
                new Object[]{
                        person.getId(), person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime())
                });
    }

    /**
     * Método en el DAO para actualizar un registro de una persona
     * @param person
     * @return
     */
    public int update(Person person) {
        return jdbcTemplate.update(
                "UPDATE PERSON " +
                        "SET NAME=?, LOCATION=?, BIRTH_DATE=? " +
                        "WHERE ID=?",
                new Object[]{
                        person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime()), person.getId(),
                });
    }
}

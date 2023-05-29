package com.demo.learnjpahibernate.jdbc;

import com.demo.learnjpahibernate.student.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentJdbcRepository {

    private final JdbcTemplate springJdbcTemplate;

    public StudentJdbcRepository(JdbcTemplate springJdbcTemplate) {
        this.springJdbcTemplate = springJdbcTemplate;
    }

    // Insert Query
    private static String INSERT_QUERY = """
            INSERT into Student (id, name, address)
            VALUES (?, ?, ?);
            """;

    // Delete Query
    private static String DELETE_QUERY = """
                    DELETE FROM Student  
                    where id = ?;
            """;

    // Read Query
    private static String SELECT_QUERY = """
                SELECT * FROM Student
                WHERE id = ?;
            """;

    public void insert(Student student) {
        springJdbcTemplate.update(INSERT_QUERY,
                student.getId(), student.getName(), student.getAddress());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }


    public Student findById(long id) {
        Student student = springJdbcTemplate
                .queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<Student>(Student.class), id);
        return student;
    }
}

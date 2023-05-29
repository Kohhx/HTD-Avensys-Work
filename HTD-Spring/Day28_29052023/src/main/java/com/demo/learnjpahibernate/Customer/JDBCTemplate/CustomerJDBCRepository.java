package com.demo.learnjpahibernate.Customer.JDBCTemplate;

import com.demo.learnjpahibernate.Customer.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerJDBCRepository {

    private final JdbcTemplate jdbcTemplate;

    public CustomerJDBCRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Insert Query
    private static String INSERT_QUERY = """
            INSERT into Customer (id, name, address, age)
            VALUES (?, ?, ?, ?);
            """;

    // Delete Query
    private static String DELETE_QUERY = """
                    DELETE FROM Customer  
                    where id = ?;
            """;

    // Read Query
    private static String SELECT_QUERY = """
                SELECT * FROM Customer
                WHERE id = ?;
            """;

    // Update Query
    private static String UPDATE_QUERY = """
                UPDATE Customer set name = ?, address = ? ,age = ?
                where id = ?;
            """;

    public void insert(Customer customer) {
        jdbcTemplate.update(INSERT_QUERY,
                customer.getId(), customer.getName(), customer.getAddress(), customer.getAge());
    }

    public void deleteById(long id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }


    public Customer findById(long id) {
        Customer customer = jdbcTemplate
                .queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<Customer>(Customer.class), id);
        return customer;
    }

    public void UpdateById(Customer customer) {
        jdbcTemplate
                .update(UPDATE_QUERY, customer.getName(), customer.getAddress(), customer.getAge(), customer.getId());
    }

}

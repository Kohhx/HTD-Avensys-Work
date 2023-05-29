package com.demo.learnjpahibernate.Customer.DataJpa;

import com.demo.learnjpahibernate.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerSpringDataJpaRepository extends JpaRepository<Customer, Long> {
}

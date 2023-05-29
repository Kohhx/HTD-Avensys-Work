package com.demo.learnjpahibernate.Customer.Jpa;

import com.demo.learnjpahibernate.Customer.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CustomerJpaRepository {
    @PersistenceContext
    private final EntityManager entityManager;

    public CustomerJpaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Customer customer) {
        entityManager.merge(customer);
    }

    public Customer findById(long id) {
        return entityManager.find(Customer.class, id);
    }

    public void deleteById(long id) {
        Customer customer =  findById(id);
        entityManager.remove(customer);
    }

    public void updateById(Customer customer){
        Customer customerFound =  findById(customer.getId());
        customerFound.setName(customer.getName());
        customerFound.setAddress(customer.getAddress());
        customerFound.setAge(customer.getAge());
        entityManager.merge(customer);
    }

}

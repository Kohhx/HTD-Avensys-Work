package com.demo.learnjpahibernate.Customer.DataJpa;

import com.demo.learnjpahibernate.Customer.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerSrpingDataJpaCommandLineRunner implements CommandLineRunner {
    private CustomerSpringDataJpaRepository customerSpringDataJpaRepository;

    public CustomerSrpingDataJpaCommandLineRunner(CustomerSpringDataJpaRepository customerSpringDataJpaRepository) {
        this.customerSpringDataJpaRepository = customerSpringDataJpaRepository;
    }

    /**
     * Spring Data JPA CRUD
     */
    @Override
    public void run(String... args) throws Exception {
        // Insert
        customerSpringDataJpaRepository.save(new Customer(1, "Kohhx", "sg", 32));
        customerSpringDataJpaRepository.save(new Customer(2, "Leon", "US", 26));
        customerSpringDataJpaRepository.save(new Customer(3, "Jane", "CHINA", 45));

        // Delete
        customerSpringDataJpaRepository.deleteById(2l); // Deleted Leon

        // Update
        customerSpringDataJpaRepository.save(new Customer(3, "Tom", "New York", 33));

        // Read
        System.out.println(customerSpringDataJpaRepository.findById(3l)); // Tom
    }
}

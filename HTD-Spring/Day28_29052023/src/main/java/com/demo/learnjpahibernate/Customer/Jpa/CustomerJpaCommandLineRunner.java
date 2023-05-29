//package com.demo.learnjpahibernate.Customer.Jpa;
//
//import com.demo.learnjpahibernate.Customer.Customer;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CustomerJpaCommandLineRunner implements CommandLineRunner {
//
//    private final CustomerJpaRepository customerJpaRepository;
//
//    public CustomerJpaCommandLineRunner(CustomerJpaRepository customerJpaRepository) {
//        this.customerJpaRepository = customerJpaRepository;
//    }
//
//    /**
//     * Spring JPA CRUD
//     */
//    @Override
//    public void run(String... args) throws Exception {
//        // Insert
//        customerJpaRepository.insert(new Customer(1, "Kohhx", "sg", 32));
//        customerJpaRepository.insert(new Customer(2, "Leon", "US", 26));
//        customerJpaRepository.insert(new Customer(3, "Jane", "CHINA", 45));
//        // Delete
//        customerJpaRepository.deleteById(2); // Deleted Leon
//
//        // Update
//        customerJpaRepository.updateById(new Customer(3, "Tom", "New York", 33));
//
//        // Read
//        System.out.println(customerJpaRepository.findById(3)); // Tom
//    }
//}

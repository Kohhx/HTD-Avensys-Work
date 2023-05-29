//package com.demo.learnjpahibernate.Customer.JDBCTemplate;
//
//import com.demo.learnjpahibernate.Customer.Customer;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CustomerJDBCCommandLineRunner implements CommandLineRunner {
//
//    private final CustomerJDBCRepository repository;
//
//    public CustomerJDBCCommandLineRunner(CustomerJDBCRepository repository) {
//        this.repository = repository;
//    }
//    @Override
//    public void run(String... args) throws Exception {
//        /**
//         * Spring JDBC CRUD
//         */
//        // Insert
//        repository.insert(new Customer(1, "Kohhx", "sg", 32));
//        repository.insert(new Customer(2, "Leon", "US", 26));
//        repository.insert(new Customer(3, "Jane", "CHINA", 45));
//
//        // Delete
//        repository.deleteById(2); // Deleted Leon
//
//        // Update
//        repository.UpdateById(new Customer(3, "Tom", "New York", 33));
//
//        // Read
//        System.out.println(repository.findById(3)); // Tom
//    }
//}

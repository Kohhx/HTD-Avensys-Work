package com.demo.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {
    @RequestMapping("/customers")
    public List<Customer> retrieveCustomers() {
        return Arrays.asList(
                new Customer(1, "kohhx", 9999.999, "woodlands st 25"),
                new Customer(2, "Leon", 555.55, "Bishan st 22"),
                new Customer(3, "John", 1000.99, "Tampines st 21")
        );
    }
}

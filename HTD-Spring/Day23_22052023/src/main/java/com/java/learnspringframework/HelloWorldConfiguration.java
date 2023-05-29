package com.java.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Student(String name, int age, Address address) {
}

record Address(String city) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Kohhx";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Student student(String name, int age, @Qualifier("addressSecondQualifer") Address address) {
        // Inject beans ourselves
//		return new Student(name(), age(), address());

        // Autowiring
        return new Student(name, age, address);
    }

//    // Change bean name
//    @Bean(name = "address2")
//    public Address addressOne() {
//        return new Address("Singapore");
//    }

    @Bean
    @Primary
    public Address addressOne() {
        return new Address("Singapore");
    }

    @Bean
    @Qualifier("addressSecondQualifer")
    public Address addressTwo() {
        return new Address("India");
    }

}

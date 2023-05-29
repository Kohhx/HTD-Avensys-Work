package com.java.learnspringframework.lazyinitialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component // Eager Initialization
class DemoOne {

    public DemoOne() {
        System.out.println("I am Demo One. I am Eager");
    }
}

@Component
@Lazy  // Lazy initialization, initialize only after context is created
class DemoTwo{
    private DemoOne demoOne;

    @Autowired
    public DemoTwo(DemoOne demoOne) {
        //I want some logic  to be executed even before
        // the criteria of initialization
        System.out.println("I am Demo 2. I am Lazy");
        this.demoOne = demoOne;
    }

    public void display() {
        System.out.println("Display something from demo 2");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationApplication.class);) {
            System.out.println("Initialzation is completed ");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            context.getBean(DemoTwo.class).display();
        }
    }
}

package com.java.learnspringframework.jakartaEE;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Component
@Named // This is from jakarta EE. Dependency injection
class BusinessClass {
    private Data data;


    public Data getData() {
        return data;
    }

//    @Autowired
    @Inject // Autowire for Jakarta EE
    public void setData(Data data) {
        System.out.println("Setter injection");
        this.data = data;
    }
}

//@Component
@Named // This is from jakarta EE. Dependency injection
class Data {


}

@Configuration
@ComponentScan
public class JakartaApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(JakartaApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessClass.class));
        }
    }
}

package com.java.learnspringframework.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SuperMarket {

    @Autowired
    CustomerOne customerOne;
    @Autowired
    CustomerTwo customerTwo;

    @Override
    public String toString() {
        return "Using " + customerOne + " and " + customerTwo + " dependencies";
    }
}

@Component
class CustomerOne {


}

@Component
class CustomerTwo {

}

@Configuration
@ComponentScan
public class DependencyInjectionApplication {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(DependencyInjectionApplication.class);) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(SuperMarket.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

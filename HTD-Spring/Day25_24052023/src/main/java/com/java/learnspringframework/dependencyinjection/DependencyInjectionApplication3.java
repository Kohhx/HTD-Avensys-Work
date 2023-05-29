package com.java.learnspringframework.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class FootBall {


    PlayerOne playerOne;
    PlayerTwo playerTwo;

    @Autowired
    public FootBall(PlayerOne playerOne, PlayerTwo playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    @Override
    public String toString() {
        return "Using " + playerOne + " and " + playerTwo + " dependencies";
    }
}

@Component
class PlayerOne {

    
}

@Component
class PlayerTwo {

}

@Configuration
@ComponentScan
public class DependencyInjectionApplication3 {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(DependencyInjectionApplication3.class);) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(FootBall.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

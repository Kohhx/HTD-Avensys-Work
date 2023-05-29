package com.java.learnspringframework;

import game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("game") // Scan for components in this package
public class GamingApplication_authentic {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(GamingApplication_authentic.class)) {
            context.getBean(GameRunner.class).run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

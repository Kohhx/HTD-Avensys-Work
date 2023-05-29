package com.java.learnspringframework.postpre;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {

    private Dependency dependency;

    public NormalClass(Dependency dependency) {
        this.dependency = dependency;
        System.out.println("All Dependencies are ready!!");
    }

    @PostConstruct // Immediately run after construction of the bean. Something like Oninit
    public void initialize() {
        dependency.getReady();
    }

    @PreDestroy // Run codes just before the bean get destroyed
    public void cleanUp() {
        dependency.cleanUp();
    }
}

@Component
class Dependency {
    public void getReady () {
        System.out.println("Post Construct -> Some logic using dependency");
    }

    public void cleanUp() {
        System.out.println("Pre destroy -> Clean up the beans");
    }
}

@Configuration
@ComponentScan
public class PostPreAnnotationApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PostPreAnnotationApplication.class)) {
//            System.out.println(context.getBean(GeneralClass.class));
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            context.getBean(NormalClass.class);
        }
    }
}


package com.java.learnspringframework.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component // Singleton design pattern
class GeneralClass {

}

@Scope( value= ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Prototype design pattern
@Component
class PrototypeClass {

}
@Configuration
@ComponentScan
public class BeanScopeApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopeApplication.class)) {
            System.out.println(context.getBean(GeneralClass.class));
            System.out.println(context.getBean(PrototypeClass.class));

            System.out.println(context.getBean(GeneralClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}

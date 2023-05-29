package com.java.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppGamingBasic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		var game = new MarioGame();
//		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//
//		gameRunner.run();

        // Launch spring context
        // 2 Ways of injecting the config into context
//		var config = new HelloWorldConfiguration(); // Method 1
//		var context = new AnnotationConfigApplicationContext(config);

//		// Method 2
        // Try and catch with resources
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("student"));

            // Access with bean name
//             System.out.println(context.getBean("address2"));
            // Access with bean type
            System.out.println(context.getBean(Address.class));


            // List out all the beans managed by spring framework
            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.stream(beanNames).forEach(System.out::println);
            System.out.println("Total Beans Count: " + context.getBeanDefinitionCount());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //


    }

}

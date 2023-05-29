//package com.java.learnspringframework.dependencyinjection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//class JavaClass {
//
//
//    StudentOne studentOne;
//
//    StudentTwo studentTwo;
//
//    @Autowired
//    public void setStudentOne(StudentOne studentOne) {
//        System.out.println("Setter Injection - SetStudent one dependency");
//        this.studentOne = studentOne;
//    }
//
//    @Autowired
//    public void setStudentTwo(StudentTwo studentTwo) {
//        System.out.println("Setter Injection - SetStudent two dependency");
//        this.studentTwo = studentTwo;
//    }
//
//    @Override
//    public String toString() {
//        return "Using " + studentOne + " and " + studentTwo + " dependencies";
//    }
//}
//
//@Component
//class StudentOne {
//
//
//}
//
//@Component
//class StudentTwo {
//
//}
//
//@Configuration
//@ComponentScan
//public class DependencyInjectionApplication2 {
//    public static void main(String[] args) {
//        try (var context =
//                     new AnnotationConfigApplicationContext(DependencyInjectionApplication2.class);) {
//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);
//
//            System.out.println(context.getBean(JavaClass.class));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

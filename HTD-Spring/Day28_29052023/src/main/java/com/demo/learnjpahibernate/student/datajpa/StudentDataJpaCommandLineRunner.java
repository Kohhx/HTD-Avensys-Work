//package com.demo.learnjpahibernate.student.datajpa;
//
//import com.demo.learnjpahibernate.student.Student;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class StudentDataJpaCommandLineRunner implements CommandLineRunner {
//
//    private final StudentRepository repository;
//
//    public StudentDataJpaCommandLineRunner(StudentRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        repository.save(new Student(1, "Kohhx", "sg"));
//        repository.save(new Student(2, "Leon", "US"));
//        repository.save(new Student(3, "Jane", "CHINA"));
//
//        repository.deleteById(2l); // Deleted Leon
//
//        System.out.println(repository.findById(3l)); // Jane
//
//    }
//}

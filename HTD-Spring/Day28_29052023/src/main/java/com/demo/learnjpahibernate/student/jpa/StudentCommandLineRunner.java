//package com.demo.learnjpahibernate.student.jpa;
//
//import com.demo.learnjpahibernate.student.Student;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class StudentCommandLineRunner implements CommandLineRunner {
//
//    private final StudentJpaRepository repository;
//
//    public StudentCommandLineRunner(StudentJpaRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        repository.insert(new Student(1, "Kohhx", "sg"));
//        repository.insert(new Student(2, "Leon", "US"));
//        repository.insert(new Student(3, "Jane", "CHINA"));
//
//        repository.deleteById(2); // Deleted Leon
//
//        System.out.println(repository.findById(3)); // Jane
//
//    }
//}

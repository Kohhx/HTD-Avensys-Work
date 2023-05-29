package com.demo.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    /**
     * http://localhost:8080/students
     * @return
     */
//    @GetMapping("/students")
    @RequestMapping("/students")
//    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> retrieveStudents() {
        return Arrays.asList(
                new Student(0001, "Kohhx", 33, "Singapore"),
                new Student(0002, "Leon", 26, "Singapore"),
                new Student(0003, "James", 25, "New York")
        );
    }



}

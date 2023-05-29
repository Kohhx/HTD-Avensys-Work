package com.demo.learnjpahibernate.student.datajpa;

import com.demo.learnjpahibernate.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

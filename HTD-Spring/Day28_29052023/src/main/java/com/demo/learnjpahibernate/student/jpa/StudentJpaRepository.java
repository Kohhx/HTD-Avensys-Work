package com.demo.learnjpahibernate.student.jpa;

import com.demo.learnjpahibernate.student.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional // Need for manipulating data
public class StudentJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public StudentJpaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void insert(Student student) {
        entityManager.merge(student);
    }

    public Student findById(long id) {
        return entityManager.find(Student.class, id);
    }

    public void deleteById(long id) {
        Student student =  findById(id);
        entityManager.remove(student);
    }
}

package com.project.EmployeeApplication.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e WHERE e.firstName ILIKE %?1% OR e.lastName ILIKE %?1% OR e.email ILIKE %?1%")
    Page<Employee> searchEmployeesByFirstNameOrLastNameOrEmail(String search, PageRequest pageable);

}

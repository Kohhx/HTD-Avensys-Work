package com.project.EmployeeApplication.employee;

import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    boolean deleteEmployeeById(int id);

    boolean updateEmployeeById(Employee employee);

    Page<Employee> getEmployeeByPage(int page, int size);

    Page<Employee> getEmployeeBySearchPage(String search, int page, int size);

}

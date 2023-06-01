package com.project.EmployeeApplication.employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    boolean deleteEmployeeById(int id);

    boolean updateEmployeeById(Employee employee);

}

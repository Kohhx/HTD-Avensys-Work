package com.project.EmployeeApplication.employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    boolean deleteEmployeeById(int id);

    boolean updateEmployeeById(Employee employee);

}

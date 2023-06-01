package com.project.EmployeeApplication.employee;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ActualEmployeeService implements EmployeeService{

    private final EmployeeRepository repository;

    public ActualEmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addEmployee(Employee employee) {
        repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Cannot find employee with ID: " + id));
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        Employee employeeFound = getEmployeeById(id);
        repository.delete(employeeFound);
        return true;
    }

    @Override
    public boolean updateEmployeeById(Employee employee) {
        Employee employeeFound = getEmployeeById(employee.getId());
        employeeFound.setFirstName(employee.getFirstName());
        employeeFound.setLastName(employee.getLastName());
        employeeFound.setEmail(employee.getEmail());
        employeeFound.setAge(employee.getAge());
        employeeFound.setAddress(employee.getAddress());
        repository.save(employeeFound);
        return true;
    }
}

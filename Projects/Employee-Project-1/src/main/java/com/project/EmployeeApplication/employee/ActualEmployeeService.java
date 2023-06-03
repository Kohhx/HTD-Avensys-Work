package com.project.EmployeeApplication.employee;

import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ActualEmployeeService implements EmployeeService {

    private final EmployeeRepository repository;

    public ActualEmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addEmployee(Employee employee) {
        if (employee.getProfileUrl() == null || employee.getProfileUrl().equals("")) {
            employee.setProfileUrl(null);
        }
        repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Page<Employee> getEmployeeByPage(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        Page employeesPage =repository.findAll(pageable);
        return employeesPage;
    }

    @Override
    public Page<Employee> getEmployeeBySearchPage(String search, int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        Page employeesPage = repository.searchEmployeesByFirstNameOrLastNameOrEmail(search, pageable);
        return employeesPage;
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
        employeeFound.setGender(employee.getGender());
        if (employee.getProfileUrl() == null || employee.getProfileUrl() == "") {
            employeeFound.setProfileUrl(null);
        } else {
            employeeFound.setProfileUrl(employee.getProfileUrl());
        }
        employeeFound.setEmail(employee.getEmail());
        employeeFound.setAge(employee.getAge());
        employeeFound.setAddress(employee.getAddress());
        repository.save(employeeFound);
        return true;
    }


}

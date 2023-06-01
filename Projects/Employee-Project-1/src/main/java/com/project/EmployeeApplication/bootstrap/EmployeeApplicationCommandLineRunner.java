package com.project.EmployeeApplication.bootstrap;

import com.project.EmployeeApplication.employee.Employee;
import com.project.EmployeeApplication.employee.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeApplicationCommandLineRunner implements CommandLineRunner {

    private final EmployeeRepository repository;

    public EmployeeApplicationCommandLineRunner(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("He Xiang", "Koh", "koh@gmail.com", 33, "Bishan st 24"));
        employees.add(new Employee("Leon", "Boon", "leon33@gmail.com", 26, "Woodlands st 12"));
        employees.add(new Employee("Ashley", "Yeo", "ashley@gmail.com", 35, "Tampines st 21"));
        repository.saveAll(employees);
    }
}

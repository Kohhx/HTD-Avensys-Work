package com.project.EmployeeApplication.bootstrap;

import com.project.EmployeeApplication.employee.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;

public class EmployeeApplicationCommandLineRunner implements CommandLineRunner {

    private final EmployeeRepository repository;

    public EmployeeApplicationCommandLineRunner(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        

    }
}

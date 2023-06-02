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

    private static String DEFAULTFRPROILEURL = "https://res.cloudinary.com/duadcuueg/image/upload/v1685708964/bubble-gum-avatar-icon_knuvhr.png";

    @Override
    public void run(String... args) throws Exception {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("Leon","Boon","male", null, "leon33@gmail.com", 26, "Woodlands st 12"));
        employees.add(new Employee("Ashley","Yeo","male", null, "ashley@gmail.com", 35, "Tampines st 21"));
        repository.saveAll(employees);
    }
}

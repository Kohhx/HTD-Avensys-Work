package com.project.EmployeeApplication.bootstrap;

import com.github.javafaker.Faker;
import com.project.EmployeeApplication.employee.Employee;
import com.project.EmployeeApplication.employee.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh1@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh2@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh3@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh4@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh5@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh6@gmail.com",33, "Bishan st 24"));

        employees.add(new Employee("Leon","Boon","male", null, "leon33@gmail.com", 26, "Woodlands st 12"));
        employees.add(new Employee("Ashley","Yeo","male", null, "ashley@gmail.com", 35, "Tampines st 21"));

        Random random = new Random();
        String genderArray[] = {"male", "female"};
        Faker faker = new Faker();

        for (int i = 0; i < 50; i++) {
            String firstName = faker.name().firstName(); // Emory
            String lastName = faker.name().lastName(); // Barton
            int age = faker.number().numberBetween(16, 99); // 18
//            String email = firstName + lastName + UUID.randomUUID() + "@gmail.com";
            String email = firstName + lastName + "@gmail.com";
            String address = faker.address().fullAddress(); // 60018 Sawayn Brooks Suite 449
            String gender = genderArray[new Random().nextInt(genderArray.length)];
            employees.add(new Employee(firstName, lastName, gender, null, email, age, address));
        }

        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh7@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh8@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh9@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh10@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh11@gmail.com",33, "Bishan st 24"));
        employees.add(new Employee("He Xiang","Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg","koh@gmail.com",33, "Bishan st 24"));

        repository.saveAll(employees);
    }
}

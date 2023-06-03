package com.project.EmployeeApplication.employee;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HardcodedEmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employees = new ArrayList<>();
    private static int employeeId = 0;
    private static String DEFAULTFRPROILEURL = "https://res.cloudinary.com/duadcuueg/image/upload/v1685708964/bubble-gum-avatar-icon_knuvhr.png";

    {
        employees.add(new Employee(++employeeId, "He Xiang", "Koh", "male", "https://res.cloudinary.com/duadcuueg/image/upload/v1685689176/Profile-Pic_wyso5b.jpg", "koh@gmail.com", 33, "Bishan st 24"));
        employees.add(new Employee(++employeeId, "Leon", "Boon", "male", DEFAULTFRPROILEURL, "leon33@gmail.com", 26, "Woodlands st 12"));
        employees.add(new Employee(++employeeId, "Ashley", "Yeo", "male", DEFAULTFRPROILEURL, "ashley@gmail.com", 35, "Tampines st 21"));
    }


    @Override
    public void addEmployee(Employee employee) {
        employees.add(new Employee(++employeeId, employee.getFirstName(), employee.getLastName(), employee.getGender(), employee.getProfileUrl(), employee.getEmail(), employee.getAge(), employee.getAddress()));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees.stream()
                .sorted((o1, o2) -> o1.getId() - o2.getId())
                .collect(Collectors.toList());
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst().get();
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        return employees.removeIf(employee -> employee.getId() == id);
    }

    @Override
    public boolean updateEmployeeById(Employee employee) {
        if (deleteEmployeeById(employee.getId())) {
            employees.add(employee);
            return true;
        }
        return false;
    }

    @Override
    public Page<Employee> getEmployeeByPage(int page, int size) {
        return null;
    }

    @Override
    public Page<Employee> getEmployeeBySearchPage(String search, int page, int size) {
        return null;
    }

}

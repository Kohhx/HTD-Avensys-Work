package com.project.EmployeeApplication.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HardcodedEmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employees = new ArrayList<>();
    private static int employeeId = 0;

    {
        employees.add(new Employee(++employeeId, "Kohhx", 33, "Bishan st24"));
        employees.add(new Employee(++employeeId, "Leon", 26, "Woodlands st12"));
        employees.add(new Employee(++employeeId, "Ashley", 35, "Tampines st21"));
    }


    @Override
    public void addEmployee(Employee employee) {
        employees.add(new Employee(++employeeId, employee.getName(), employee.getAge(), employee.getAddress()));
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
        ;
        return false;
    }
}

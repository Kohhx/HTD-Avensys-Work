package com.project.EmployeeApplication.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("username")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(value = "list-employees", method = RequestMethod.GET)
    public String listAllEmployees(ModelMap model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "listEmployees";
    }

    @RequestMapping(value = "add-employee", method = RequestMethod.GET)
    public String newEmployeePage(ModelMap model) {
        Employee employee = new Employee();
        model.put("employee", employee);
        return "employee";
    }

    @RequestMapping(value = "add-employee", method = RequestMethod.POST)
    public String createNewEmployee(ModelMap model, Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:list-employees";
    }

    @RequestMapping(value = "delete-employee")
    public String deleteEmployee(@RequestParam("id") int employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "redirect:list-employees";
    }


}

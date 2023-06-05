package com.project.EmployeeApplication.employee;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes({"username","role"})

public class EmployeeController {

    private final EmployeeService employeeService;
    private String DEFAULTFRPROILEURL = "https://res.cloudinary.com/duadcuueg/image/upload/v1685708964/bubble-gum-avatar-icon_knuvhr.png";

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // This is for hardcodedService
//    @RequestMapping(value = "list-employees", method = RequestMethod.GET)
//    public String listAllEmployees(ModelMap model) {
//    String username = (String) model.get("username");
//        if (username == null || username.isEmpty()) {
//        return "redirect:login";
//    }
//        List<Employee> employees = employeeService.getAllEmployees();
//        model.addAttribute("employees", employees);
//        model.put("totalPages", 1);
//        model.put("page", 1);
//        model.put("defaultProfileUrl", DEFAULTFRPROILEURL);
//        return "listEmployees";
//    }

    @RequestMapping(value = "list-employees", method = RequestMethod.GET)
    public String listAllEmployees(ModelMap model, @RequestParam(required = false) String page, @RequestParam(required = false) String search) {
        String username = (String) model.get("username");
        if (username == null || username.isEmpty()) {
            return "redirect:login";
        }

        String role = (String) model.get("role");
            int pageInt = Integer.parseInt(page);
            int size = 10;
            model.put("defaultProfileUrl", DEFAULTFRPROILEURL);
            Page<Employee> employees;
            if (search != null && !search.isEmpty()) {
                employees = employeeService.getEmployeeBySearchPage(search, pageInt - 1, size);
                model.put("search", search);
            } else {
                employees = employeeService.getEmployeeByPage(pageInt - 1, size);
            }
            model.put("totalPages", employees.getTotalPages());
            model.put("page", pageInt);
            model.addAttribute("employees", employees.getContent());
            return "listEmployees";
    }

    @RequestMapping(value = "add-employee", method = RequestMethod.GET)
    public String newEmployeePage(ModelMap model) {
        String username = (String) model.get("username");
        if (username == null || username.isEmpty()) {
            return "redirect:login";
        }

        Employee employee = new Employee();
        model.put("defaultProfileUrl", DEFAULTFRPROILEURL);
        model.put("employee", employee);
        model.put("type", "create");
        model.put("title", "Create New Employee");
        model.put("gender", List.of("male", "female"));
        return "employee";
    }

    @RequestMapping(value = "add-employee", method = RequestMethod.POST)
    public String createNewEmployee(ModelMap model, @Valid Employee employee, BindingResult result) {
        String username = (String) model.get("username");
        if (username == null || username.isEmpty()) {
            return "redirect:login";
        }

        if (result.hasErrors()) {
            model.put("type", "create");
            model.put("gender", List.of("male", "female"));
            model.put("defaultProfileUrl", DEFAULTFRPROILEURL);
            model.put("title", "Create New Employee");
            return "employee";
        }
        employeeService.addEmployee(employee);
        return "redirect:list-employees?page=1";
    }

    @RequestMapping(value = "delete-employee")
    public String deleteEmployee(@RequestParam("id") int employeeId, ModelMap model) {
        String username = (String) model.get("username");
        if (username == null || username.isEmpty()) {
            return "redirect:login";
        }

        employeeService.deleteEmployeeById(employeeId);
        return "redirect:list-employees?page=1";
    }

    @RequestMapping(value = "update-employee", method = RequestMethod.GET)
    public String updateEmployeePage(@RequestParam("id") int employeeId, ModelMap model) {
        String username = (String) model.get("username");
        if (username == null || username.isEmpty()) {
            return "redirect:login";
        }

        Employee employee = employeeService.getEmployeeById(employeeId);
        model.put("defaultProfileUrl", DEFAULTFRPROILEURL);
        model.put("employee", employee);
        model.put("gender", List.of("male", "female"));
        model.put("type", "update");
        model.put("title", "Update Employee");
        return "employee";
    }

    @RequestMapping(value = "update-employee", method = RequestMethod.POST)
    public String updateEmployeePage(ModelMap model, @Valid Employee employee, BindingResult result) {
        String username = (String) model.get("username");
        if (username == null || username.isEmpty()) {
            return "redirect:login";
        }

        if (result.hasErrors()) {
            model.put("type", "update");
            model.put("gender", List.of("male", "female"));
            model.put("title", "Update Employee");
            return "employee";
        }
        employeeService.updateEmployeeById(employee);
        return "redirect:list-employees?page=1";
    }

    @RequestMapping(value = "employee/{employeeId}", method = RequestMethod.GET)
    public String showEmployee(@PathVariable int employeeId, ModelMap model) {
        String username = (String) model.get("username");
        if (username == null || username.isEmpty()) {
            return "redirect:login";
        }

        Employee employee = employeeService.getEmployeeById(employeeId);
        model.put("employee", employee);
        model.put("defaultProfileUrl", DEFAULTFRPROILEURL);
        return "showEmployee";
    }
}

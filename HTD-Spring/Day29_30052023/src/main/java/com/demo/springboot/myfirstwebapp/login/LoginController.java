package com.demo.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

//    @RequestMapping("/login")
    @GetMapping("/login")
    public String gotToLoginPage(@RequestParam(required = false) String name, ModelMap model) {
        System.out.println("Name: " + name);
        model.put("name",name);
        return "login";
    }
}

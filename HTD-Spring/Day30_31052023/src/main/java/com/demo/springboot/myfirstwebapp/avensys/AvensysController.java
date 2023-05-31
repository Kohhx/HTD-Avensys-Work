package com.demo.springboot.myfirstwebapp.avensys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AvensysController {

    @GetMapping("/avensys")
    public String gotToAvensysPage(@RequestParam String group, @RequestParam String name, ModelMap model) {
        model.put("name", name);
        model.put("group", group);
        return "avensys";
    }
}

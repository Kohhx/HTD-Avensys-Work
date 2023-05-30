package com.demo.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @GetMapping("/hello")
    @ResponseBody // convert response to JSON
    public String hello() {
        return "Hey Team!! Welcome to learn your first application";
    }


    @GetMapping("/hello-html")
    @ResponseBody
    public String helloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first web application </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hey Team!! Welcome to learn your first application!! GO!</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    @GetMapping("hello-jsp")
    public String helloJsp() {
        return "hello";
    }

}

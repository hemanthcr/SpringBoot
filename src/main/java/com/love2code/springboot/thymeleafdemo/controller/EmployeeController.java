package com.love2code.springboot.thymeleafdemo.controller;

import com.love2code.springboot.thymeleafdemo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    @GetMapping("/employee")
    public String listEmployees(Model model){

        Employee emp1 = new Employee(1,"Hemanth", "Raj", "hemanthcr156@hmail.com");
        Employee emp2 = new Employee(1,"Raj", "Kumar", "Raj@hmail.com");
        Employee emp3 = new Employee(1,"Arun", "Kumar", "Arun@hmail.com");

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        model.addAttribute("employee", list);

        return "list-employee";
    }
}

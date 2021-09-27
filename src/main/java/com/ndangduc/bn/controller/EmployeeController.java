package com.ndangduc.bn.controller;

import com.ndangduc.bn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", this.employeeService.getAllEmployees());
        return "index";
    }
}

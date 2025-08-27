package com.sch.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("origin = ")
public class RestEmployeeController {

    EmployeeService employeeService;

    //생성자를 이용한 Loose 커플링 DI
    @Autowired
    public RestEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //React --> 사원등록
    @PostMapping("/employees/register")
    public String employeeRegister(@RequestBody Employee employee) {
        return employeeService.register(employee);
    }

    //React --> 사원리스트
    @GetMapping("/employees")
    public List<Employee> employees () {
        return employeeService.findAll();
    }



}

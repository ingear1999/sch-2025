package com.sch.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    //생성자를 이용하여 EmployeeRespoitory 를 loose -> DI

    EmployeeReposity employeeReposity;

    @Autowired
    public EmployeeService(EmployeeReposity employeeReposity) {
        this.employeeReposity = employeeReposity;
    }

    //사원리스트

    public List<Employee> findAll(){
        return employeeReposity.selectAll();
    }
    //사원등록
    public String register(Employee employee){
        return employeeReposity.insert(employee);

    }
}

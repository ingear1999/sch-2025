package com.sch.springboot.controller;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeReposity {

    //사원객체를 저장하는 List <Employee>
    private List<Employee> list= new ArrayList<Employee>();

    public List<Employee> selectAll(){

        return list;
    }
    public String insert(Employee employee){
        String result=" ";
       if(list.add(employee)) {

           result="success";

       }else{

           result="fail";

       }
        return result;
    }
}

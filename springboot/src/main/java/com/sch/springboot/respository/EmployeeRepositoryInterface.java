package com.sch.springboot.respository;

import com.sch.springboot.dto.Employee;

import java.util.List;


/*
*인터페이스의 자식을 통해 생성 --> 자식은 인터페스의 모든 메소드를 오바로딩 행야 함.
 */
public interface EmployeeRepositoryInterface {
    public List<Employee> selectAll();
    public  int  insert(Employee employee);
}

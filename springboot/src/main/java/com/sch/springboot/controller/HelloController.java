package com.sch.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/spring-mvc")
    public String springmvc(Model model){
        model.addAttribute("msg","홍길동");
        return "spring-mvc";
    }

    @GetMapping("/hello")
    public String hello(){
        //hello.html view에게 데이 터 전달 -->Model
        //model.addAttribute("msg","홍길동");
        return "hello"; // view name : msg="홍길동"
    }
}

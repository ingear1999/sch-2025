package com.sch.springboot.controller;

import dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class memberController {
    @GetMapping("/member")
    public String member(@RequestParam ("name") String name  ,
                         @RequestParam ("age") int age,
                         @RequestParam ("address") String address,
                         Model model) {

        Member member = new Member();
        member.setName(name);
        member.setAge(age);
        member.setAddress(address);


        model.addAttribute("member",member);

        /*System.out.println(name);
        System.out.println(age);
        System.out.println(address);*/
        return "member"; //View name
    }
}

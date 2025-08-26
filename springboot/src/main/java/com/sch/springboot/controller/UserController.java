package com.sch.springboot.controller;

import com.sch.springboot.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sch.springboot.service.UserService;

@Controller
public class UserController {
    UserService userService = new UserService();

    @ResponseBody
    @PostMapping("/login")
    public String login( User user){
        return userService.login(user);
    }


    @ResponseBody
    @PostMapping("/signup")
    public String signup( User user){
        return userService.sigUp(user);
    }
}

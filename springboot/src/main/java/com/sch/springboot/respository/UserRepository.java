package com.sch.springboot.respository;


import com.sch.springboot.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    /**
     * login: 로그인 처리
     */
    public String login(User user){
        String did= "test";
        String dpass="1234";
        String result= "";
        if(user.getId().equals(did)&&user.getPass().equals(dpass)){
            //login sucessful
            result="login success";
        }else{
            //login fail
            result="login fail";
        }
        return result;
    }
}

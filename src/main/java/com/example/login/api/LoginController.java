package com.example.login.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LoginController {
    @GetMapping("/")
    public String homePage(){
        return "This is a home page";
    }

    @GetMapping("firstPage")
    public String firstPage(){
        return "You login successfully";
    }
    @GetMapping("/user")
    public Principal user(Principal principal){
        System.out.println("username:"+principal.getName());
        return principal;
    }
}

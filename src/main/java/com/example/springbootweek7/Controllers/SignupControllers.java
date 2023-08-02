package com.example.springbootweek7.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupControllers {
    @GetMapping("/signUp")
    public String getSignUpPage(){
        return "signup_page";
    }
}

package com.example.springbootweek7.Controllers;

import com.example.springbootweek7.DTOs.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/logIn")
public class LoginControllers {
    @GetMapping("/logIn")
    public String getSignUpPage(){
        return "login_page";
    }

}

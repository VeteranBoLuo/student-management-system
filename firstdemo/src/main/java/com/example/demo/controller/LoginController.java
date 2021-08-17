package com.example.demo.controller;

import com.example.demo.service.ILoginService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
@RequestMapping("main")
@Api(tags = "登录")
public class LoginController {
    @Autowired
    ILoginService iLoginService;

    @PostMapping("login")
    public ModelAndView Login(String userName , String password){
       if(iLoginService.login(userName,password)!=null){
        return new ModelAndView("register");
       }else {
           return null;
       }
    }



}

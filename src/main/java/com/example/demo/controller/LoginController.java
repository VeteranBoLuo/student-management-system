package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.ILoginService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Api(tags = "登录")
public class LoginController {
    @Autowired
    ILoginService iLoginService;
    @Autowired
    UserDao userDao;

    @RequestMapping("/")
    public String Login(){
        return "login";
    }

    @PostMapping("doLogin")
    public ModelAndView doLogin(String userName , String password){
        if(userName!=null){
           User u = userDao.getByUserName(userName);
            if(u!=null&&u.getPassword().equals(password)){
                ModelAndView modelAndView = new ModelAndView("message");
                modelAndView.addObject("user",u);
                   return modelAndView;
                }

        }
        return null;
    }
    @RequestMapping("register")
    public String register(){
        return "register";
    }

}

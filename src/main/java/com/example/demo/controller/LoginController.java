package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.ILoginService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

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
    public String doLogin(String userName , String password, HttpSession httpSession, Model model){
           User u = userDao.getByUserName(userName);
            if(u!=null&&u.getPassword().equals(password)){
                httpSession.setAttribute("currentuser",u);
                   return  "notifications";
                }else{
                model.addAttribute("error","用户名或密码输入错误，登陆失败");
                return "forward:/";
            }


    }
    @RequestMapping("register")
    public String register(){
        return "register";
    }

    @RequestMapping("notifications")
    public String notifications(){
        return "notifications";
    }
}

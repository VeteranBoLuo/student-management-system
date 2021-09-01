package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
/**
 * 登录界面
 */
@Controller
@Api(tags = "登录")
public class LoginController {

    @Autowired
    UserDao userDao;

    /**
     * 跳转至系统主界面
     * @return
     */
    @RequestMapping("/")
    public String Login(){
        return "login";
    }

    /**
     * 登录
     * @param userName
     * @param password
     * @param httpSession
     * @param model
     * @return
     */
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

    /**
     * 管理员注册
     * @return
     */
    @RequestMapping("register")
    public String register(){
        return "register";
    }



}

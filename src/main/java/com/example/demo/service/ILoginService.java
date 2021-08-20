package com.example.demo.service;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

public interface ILoginService {

    ModelAndView login(String username, String password, HttpSession httpSession);
}

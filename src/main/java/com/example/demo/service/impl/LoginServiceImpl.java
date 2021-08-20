package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.ILoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Service
@Slf4j
public class LoginServiceImpl implements ILoginService {
    @Autowired
    UserDao userDao;

    @Override
    public ModelAndView login(String userName, String password, HttpSession httpSession) {

        if(userName!=null){
            Optional<User> u = Optional.ofNullable(userDao.findByUserName(userName));
            if(u.isPresent()){
                if(u.get().getPassword().equals(password)) {
                    httpSession.setAttribute("currentuser", u.get());
                    return new ModelAndView("message");
                }
            }
        }
        return null;
    }
}

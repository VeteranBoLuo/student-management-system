package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.ILoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class LoginServiceImpl implements ILoginService {
    @Autowired
    UserDao userDao;

    @Override
    public User login(String userName, String password) {
        if(userName!=null){
            Optional<User> u = Optional.ofNullable(userDao.findByUserName(userName));
            if(u.isPresent()){
                if(u.get().getPassword().equals(password))
                return u.get();
            }
        }
        return null;
    }
}

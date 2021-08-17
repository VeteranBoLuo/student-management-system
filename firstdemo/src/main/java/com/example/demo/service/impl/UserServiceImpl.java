package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.req.UserSaveReq;
import com.example.demo.req.UserUpdateReq;
import com.example.demo.res.UserBasicRes;
import com.example.demo.service.IUserService;
import lombok.NonNull;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;


    @Override
    public UserBasicRes save(UserSaveReq req) {
        User user = new User();
        BeanUtils.copyProperties(req,user);
        userDao.save(user);
        UserBasicRes userBasicRes = new UserBasicRes();
        BeanUtils.copyProperties(user,userBasicRes);
        return userBasicRes;
    }

    @Override
    public UserBasicRes update(@NonNull UserUpdateReq req) {
       if(req.getId()!=null){
           Optional<User> byId = userDao.findById(req.getId());
           if(byId.isPresent()){
               User user = new User();
               BeanUtils.copyProperties(req,user);
               userDao.save(user);
               UserBasicRes userBasicRes = new UserBasicRes();
               BeanUtils.copyProperties(user,userBasicRes);
               return userBasicRes;
           }
       }
        return null;
    }

    @Override
    public UserBasicRes findById(Long id) {
        User user = userDao.getById(id);
        UserBasicRes userBasicRes = new UserBasicRes();
        BeanUtils.copyProperties(user,userBasicRes);
        return userBasicRes;
    }

    @Override
    public UserBasicRes delById(@NonNull Long id) {
        User user = userDao.getById(id);
        UserBasicRes userBasicRes = new UserBasicRes();
        BeanUtils.copyProperties(user,userBasicRes);
        userDao.delete(user);
        return userBasicRes;
    }


}

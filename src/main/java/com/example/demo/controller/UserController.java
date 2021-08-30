package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@Slf4j
@RestController
@RequestMapping("user")
@Api(tags = "管理员信息")
public class UserController {

    @Autowired
    UserDao userDao;
    @Autowired
    IUserService userService;

    @ApiOperation(value = "注册")
    @PostMapping("save")
    public User save(@RequestBody User user){
            return userService.save(user);
    }

//    @ApiOperation("根据id删除")
//    @PostMapping("delById")
//    public User delById(@NonNull Long id) {
//        return userService.delById(id);
//    }


//    @ApiOperation("查询所有")
//    @PostMapping("findAll")
//    public List<User> findAll(){
//        List<User> users = userDao.findAll();
//        return users;
//    }
}

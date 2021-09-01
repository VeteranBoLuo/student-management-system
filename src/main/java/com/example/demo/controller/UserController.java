package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@Slf4j
@RestController
@RequestMapping("user")
@Api(tags = "管理员信息")
public class UserController {

    @Autowired
    UserDao userDao;
    @Autowired
    IUserService userService;

    /**
     * 管理员注册
     * @param user
     * @return
     */
    @ApiOperation(value = "注册")
    @PostMapping("save")
    public User save(@RequestBody User user){
            return userService.save(user);
    }

}

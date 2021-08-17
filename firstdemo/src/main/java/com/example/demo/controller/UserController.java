package com.example.demo.controller;

import com.example.demo.bean.ReqBean;
import com.example.demo.bean.ResultBean;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.req.UserSaveReq;
import com.example.demo.req.UserUpdateReq;
import com.example.demo.res.UserBasicRes;
import com.example.demo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@Slf4j
@RestController
@RequestMapping("user")
@Api(tags = "用户信息")
public class UserController {

    @Autowired
    UserDao userDao;
    @Autowired
    IUserService userService;

    @ApiOperation(value = "保存")
    @PostMapping("save")
    public ResultBean<UserBasicRes> save(@RequestBody ReqBean<UserSaveReq> req){
        log.info("zhix");
        if(req!=null) {
            return new ResultBean<UserBasicRes>(userService.save(req.getBody()));
        }
             return null;
    }


    @PostMapping("save1")
    public User save1(@RequestBody User user){
        log.info(user.getName());
       return user;
    }
    @ApiOperation(value = "更新")
    @PostMapping("update")
    public  ResultBean<UserBasicRes> update(@RequestBody ReqBean<UserUpdateReq> req){
        if(req!=null) {
            return new ResultBean<UserBasicRes>(userService.update(req.getBody()));
        }
            return null;
    }

    @ApiOperation("根据id查询")
    @PostMapping("findById")
    public ResultBean<UserBasicRes> findById(@RequestBody ReqBean<Long> req){
        if(req!=null) {
            return new ResultBean<UserBasicRes>(userService.findById(req.getBody()));
        }
        return null;
    }

    @ApiOperation("根据id删除")
    @PostMapping("delById")
    public ResultBean<UserBasicRes> delById(@RequestBody ReqBean<Long> req){
        if(req!=null) {
            return new ResultBean<UserBasicRes>(userService.delById(req.getBody()));
        }
        return null;
    }


    @ApiOperation("查询所有")
    @PostMapping("findAll")
    public List<User> findAll(){
        List<User> users = userDao.findAll();
        return users;
    }
}

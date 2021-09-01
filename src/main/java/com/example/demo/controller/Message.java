package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Api(tags = "主界面")
@Controller
public class Message {
    @Autowired
    StudentDao studentDao;

    /**
     * 查看全部学生信息
     * @return
     */
    @RequestMapping("/message")
    public ModelAndView message(){
    ModelAndView mav =new ModelAndView();
    List<Student> students =  studentDao.findAll();
    mav.addObject("students",students);
    mav.setViewName("message");
    return mav;
    }

    /**
     * 公告
     * @return
     */
    @RequestMapping("notifications")
    public String notifications(){
        return "notifications";
    }
}

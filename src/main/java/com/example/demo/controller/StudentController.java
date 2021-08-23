package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Autowired
    StudentDao studentDao;

    @RequestMapping("/sregister")
    public String register(){
        return "sregister";
    }

    @ResponseBody
    @PostMapping("/Sregister")
    public Student Register(@RequestBody Student student){
        studentDao.save(student);
        return student;
    }

    public Student Retrieve(String )
}


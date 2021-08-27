package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
        if(studentDao.getByCard(student.getCard())==null) {
            studentDao.save(student);
            return student;
        }
      return null;
    }

    @RequestMapping("/delete")
    public String delete(){
        return "delete";
    }
    @Transactional
    @PostMapping("/Delete")
    public void Delete(String card){
        studentDao.deleteByCard(card);
    }

    @RequestMapping("/retrieve")
    public String retrieve(){
        return "retrieve";
    }

    @PostMapping("/Retrieve")
    public ModelAndView Retrieve(String card){
        Student student = studentDao.getByCard(card);
        ModelAndView mav =new ModelAndView("Aretrieve");
        mav.addObject("student",student);
        return mav;
    }
}


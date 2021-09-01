package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
@Api(tags = "学生信息")
@Controller
public class StudentController {
    @Autowired
    StudentDao studentDao;

    /**
     * 跳转至学生注册页面
     * @return
     */
    @GetMapping("/sregister")
    public String register(){
        return "sregister";
    }

    /**
     * 实现学生注册
     * @param student
     * @return
     */
    @ApiOperation(value = "注册")
    @ResponseBody
    @PostMapping("/Sregister")
    public Student Register(@RequestBody Student student){
        if(studentDao.getByCard(student.getCard())==null&&student.getCard()!="") {
            studentDao.save(student);
            return student;
        }
      return null;
    }

    /**
     * 跳转至修改学生信息页面
     * @return
     */
    @GetMapping("/update")
    public String update(){
        return "update";
    }

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    @ApiOperation(value = "修改")
    @ResponseBody
    @PostMapping("/Supdate")
    public Student Update(@RequestBody Student student){
       Student newStudent =studentDao.getByCard(student.getCard());
       if(newStudent!=null){
           newStudent.setName(student.getName());
           newStudent.setSex(student.getSex());
           newStudent.setPhone(student.getPhone());
           studentDao.save(newStudent);
            return newStudent;
        }
        return null;
    }

    /**
     * 跳转至删除学生页面
     * @return
     */
    @GetMapping("/delete")
    public String delete(){
        return "delete";
    }

    /**
     * 删除学生
     * @param card
     */
    @ApiOperation(value = "删除")
    @Transactional
    @PostMapping("/Delete")
    public void Delete(String card){
        studentDao.deleteByCard(card);
    }

    /**
     * 跳转至搜索学生页面
     * @return
     */
    @GetMapping("/retrieve")
    public String retrieve(){
        return "retrieve";
    }

    /**
     * 搜索学生信息
     * @param card
     * @return
     */
    @ApiOperation(value = "搜索")
    @PostMapping("/Retrieve")
    public ModelAndView Retrieve(String card){
        Student student = studentDao.getByCard(card);
        ModelAndView mav =new ModelAndView("Aretrieve");
        mav.addObject("student",student);
        return mav;
    }
}


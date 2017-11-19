package com.wsz.mybatis.controller;

import com.wsz.mybatis.domain.Student;
import com.wsz.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author wsz
 * @Des:
 * @Date: 2017/11/14
 */
@Controller
public class StudentController {

    private final static String MODELPATH = "/";


    @Autowired
    private StudentService studentService;

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView();
        List<Student> students = studentService.findAll();
        model.addObject("list",students);
        model.setViewName(MODELPATH+"index");
        return model;
    }

    @RequestMapping("addForm")
    public ModelAndView addForm(){
        ModelAndView model = new ModelAndView();
        model.setViewName(MODELPATH+"addForm");
        return model;
    }

    @RequestMapping("saveStudent")
    public String saveStudent(Student student){
        int save =  studentService.saveStudent(student);
        System.out.println(save);
        return "redirect:/index";
    }

    @RequestMapping("deleteStudent")
    public String deleteStudent(int id){
        int i = studentService.deleteUser(id);
        if(i>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        return "redirect:/index";
    }

    @RequestMapping("updateForm")
    public ModelAndView updateForm(int id){
        ModelAndView model = new ModelAndView();
        Student student = studentService.findOne(id);
        model.addObject("student",student);
        model.setViewName(MODELPATH+"updateForm");
        return model;
    }

    @RequestMapping("updateStudent")
    public String updateStudent(Student student){
        int save =  studentService.updateStudent(student);
        System.out.println(save);
        return "redirect:/index";
    }

    @RequestMapping("searchStudent")
    public ModelAndView searchStudent(String realname){
        Student username = studentService.findByUsername("123");
        System.out.println(username.toString());
        ModelAndView model = new ModelAndView();
        List<Student> list =  studentService.findByRealname(realname);
        model.addObject("list",list);
        model.setViewName(MODELPATH+"index");
        return model;
    }

}

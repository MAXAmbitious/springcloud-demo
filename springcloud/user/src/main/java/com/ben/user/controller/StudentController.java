package com.ben.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ben.common.mapper.pojo.RestfulResult;
import com.ben.user.pojo.Student;
import com.ben.user.service.StudentService;

@RestController
@RequestMapping("/hello")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public RestfulResult queryStudent(@RequestBody Student student){
        RestfulResult result = new RestfulResult();
        result.setMessage("1");
        result.setData(studentService.queryStudent(student));
        return result;
    }
}

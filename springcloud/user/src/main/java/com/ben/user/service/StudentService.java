package com.ben.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ben.user.mapper.StudentMapper;
import com.ben.user.pojo.Student;

@Service
public class StudentService {

    @Autowired
    private StudentMapper<?> studentMapper;

    public List<Student> queryStudent(Student student){
        List list = studentMapper.select(student);
        return list;
    }

}
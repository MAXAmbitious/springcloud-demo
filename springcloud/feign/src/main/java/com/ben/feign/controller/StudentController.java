package com.ben.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ben.common.mapper.pojo.RestfulResult;
import com.ben.feign.client.ServiceFeignClient;
import com.ben.feign.pojo.Student;

@RestController
@RequestMapping("/hi")
public class StudentController {

    @Autowired
    private ServiceFeignClient serviceFeignClient;

    @RequestMapping("/student")
    public RestfulResult queryStudent(@RequestBody Student student){
        return  serviceFeignClient.queryStudent(student);
    }
    
    @RequestMapping("/hystrix")
    public RestfulResult hystrix(){
        return  serviceFeignClient.testHystrix();
    }

}

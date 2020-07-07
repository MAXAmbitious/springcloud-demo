package com.ben.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ben.common.mapper.pojo.RestfulResult;
import com.ben.feign.pojo.Student;

@Component
@FeignClient(name = "student-service", fallback = ServiceFallback.class)
public interface ServiceFeignClient {
	@RequestMapping(value = "/hello/student", method = RequestMethod.POST)
	RestfulResult queryStudent(@RequestBody Student student);
	
	@RequestMapping(value = "/student/hello/hystrix", method = RequestMethod.GET)
	RestfulResult testHystrix();
}

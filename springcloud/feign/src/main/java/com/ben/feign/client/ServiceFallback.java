package com.ben.feign.client;

import org.springframework.stereotype.Component;

import com.ben.common.mapper.pojo.RestfulResult;
import com.ben.feign.pojo.Student;

@Component
public class ServiceFallback implements ServiceFeignClient {
    @Override
    public RestfulResult queryStudent(Student student) {
        RestfulResult result = new RestfulResult();
        result.setData("服务调用失败");
        return result;
    }
}

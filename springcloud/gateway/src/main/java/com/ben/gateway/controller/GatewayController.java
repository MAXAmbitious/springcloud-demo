package com.ben.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController{
	
	@RequestMapping(value = "/fallback")
	public String fallback(){
		
		return "fallback nothing";
	}
}

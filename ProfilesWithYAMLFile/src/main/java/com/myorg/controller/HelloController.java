package com.myorg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myserver")
public class HelloController {
	
	@Value("${service.name}")
	private String service;
	
	
	@GetMapping("/getServer")
	public String getMe()
	{
		return "Hi I am "+ service;
	}
	

}

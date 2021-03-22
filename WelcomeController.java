package com.practice.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springboot.configuration.AppConfig;

@RestController
public class WelcomeController {
	
	@Autowired
	AppConfig config;
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public Map welcomeHome() {
		Map map=new HashMap<>();
		map.put("Value", config.isValue());
		map.put("ID", config.getId());
		map.put("Name", config.getName());
		
		return map;
	}
}

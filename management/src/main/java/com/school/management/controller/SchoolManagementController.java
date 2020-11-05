package com.school.management.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class SchoolManagementController {

	private static final Logger LOG = LoggerFactory.getLogger(SchoolManagementController.class);
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public Map<String,String> Test(){
		LOG.info("Test API");
		Map<String,String> map = new HashMap<String, String>();
		map.put("Hey folk", "your test API is working");
		return map;
	}
}

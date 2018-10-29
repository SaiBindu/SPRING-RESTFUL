package com.cg.springrestful.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springrestful.dto.Mobile;
import com.cg.springrestful.service.IMobileService;





@RestController

public class MobileRestController {
	@Autowired
	IMobileService mobileservice;
	@RequestMapping(value = "/getall/{name}",method = RequestMethod.GET)
     public String getAllMobile(@PathVariable String name) {
		String restfull = "WELCOME TO SPRING REST";
    	 
    	 return restfull;
    	 
     }
	
	//connecting to JPA
	@RequestMapping(value = "/getalljpa",method = RequestMethod.GET)
	
	public List<Mobile> getByJpaMobile() {
		return mobileservice.getAllData();
		
	}
	@RequestMapping(value = "/createresource",method = RequestMethod.POST)
	public String createData(@RequestBody Mobile mob) {
		String data = mob.toString();
		return data;
		
	}
	
}

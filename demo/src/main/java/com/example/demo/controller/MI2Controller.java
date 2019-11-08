package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.dao.DataInterface;
import com.example.demo.model.ObjectClass;
@Controller
public class MI2Controller {
	@Autowired
	DataInterface d;
	
	@RequestMapping("/mi2")
	public String home(@RequestBody ObjectClass object)
	{
		
		System.out.println(object);
		d.save(object);
		return "hello";
	}
	

}

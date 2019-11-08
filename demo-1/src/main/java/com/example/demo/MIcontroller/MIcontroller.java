package com.example.demo.MIcontroller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.ObjectClass;

@RestController
public class MIcontroller {
	@Autowired
	private RestTemplate rest;
	@RequestMapping("/login")
	public ModelAndView log()
	{
		ModelAndView  modelAndView = new ModelAndView(); 
		  modelAndView.setViewName("login.html");
	      return modelAndView;
	}
	
	@RequestMapping("/Index")
	public ModelAndView home()
	{
		ModelAndView  modelAndView = new ModelAndView(); 
		  modelAndView.setViewName("Index.html");
	      return modelAndView;
	}
	
	@RequestMapping("/Index/registration")
	public String signup(ObjectClass object)
	{
		String s="pathak";
		System.out.println(s);
		System.out.println(object);
		try {
		s=rest.postForObject("http://localhost:8081/mi2", object, String.class);
		}
		catch (HttpStatusCodeException e) {
			e.getMessage();
		}
		System.out.println(s);
		return "Registration done";
		
	}
	

}
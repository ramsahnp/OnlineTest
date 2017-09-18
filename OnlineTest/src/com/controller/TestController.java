package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Questions;


@Controller
public class TestController 
{
	
	@RequestMapping("/userlogin")
 public ModelAndView userRequestHandler(@RequestParam("uname") String userName,@RequestParam("upass") String userPass)
 {
		//To validate user wether it is valid or not if it is valid then we can proceed.
		
		
		if(userPass.equals(("root")))
				{
			
			
			     return new ModelAndView("test");
				}
		ModelAndView m=new ModelAndView("userlogin");
		m.addObject("message", "Please enter correct passwrod !");
		return m;
 }
	
	

	@RequestMapping("/adminlogin")
 public ModelAndView adminRequestHandler(@RequestParam("aname") String userName,@RequestParam("apass") String userPass)
 {
		//To validate admin wether it is valid or not if it is valid then we can proceed.
		
		
		if(userPass.equals(("admin")))
				{
			     return new ModelAndView("addQuestion");
				}
		ModelAndView m=new ModelAndView("adminlogin");
		m.addObject("message", "Please enter correct passwrod !");
		return m;
 }
	
	@RequestMapping("/addques")
	 public ModelAndView addQuesRequestHandler(@RequestAttribute("question1") Questions que)
	 {
		/*
		 * Now data is going to model object and we need to pass this data to the dao class so that we can persist data.. 
		 * 
		 * */
		
		
		ModelAndView m1=new ModelAndView("addQuestion");
		m1.addObject("message", "one question has been added successfully !");
		return m1;
			
			
	 }	
	
	
	
	
	
	
	
	
	
	
	
}

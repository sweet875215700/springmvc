package com.sweet.controller;

import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sweet.service.UserService;

@Controller
@RequestMapping("/view")
public class UserController {
	
	@Resource(name="userService")
	private UserService service;
	
	@RequestMapping(value="/manager",method=RequestMethod.GET)
	public ModelAndView hello2(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "HelloMVC");
		mv.setViewName("users");
		return mv;
	}

	
	@RequestMapping(value="/count",method=RequestMethod.GET)
	public ModelAndView count(){
		
		int c = service.userCount();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", c);
		mv.setViewName("users");
		return mv;
	}
}



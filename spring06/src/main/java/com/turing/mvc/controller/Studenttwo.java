package com.turing.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Studenttwo  {
	
	@RequestMapping("/show")
	public ModelAndView show()
	{
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("/stu2.jsp");
		
		mv.addObject("name", "Àî°×");
		return mv;
	}
}

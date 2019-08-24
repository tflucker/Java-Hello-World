package com.tim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	//main entry point for application, will load the index.jsp
	@RequestMapping(method=RequestMethod.GET, value="/")
	public String home() {
		return "index";
	}
	
}

package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	//return welcome page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		//handle the data recived from user
		String userEnteredValue = request.getParameter("foodType");
		
		//adding captured value to model
		model.addAttribute("userInput", userEnteredValue);
		
		//set the user data with model object and send it to view
		return "process-order";
	}
}

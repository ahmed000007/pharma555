package com.pharma5.controllers;

import com.pharma5.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListUserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public String listUsers(Model model, @RequestParam(defaultValue="")  String name) {
		model.addAttribute("user", userService.findAll());
		
		return "views/user";
	}

}
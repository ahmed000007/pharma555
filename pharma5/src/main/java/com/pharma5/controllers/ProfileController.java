package com.pharma5.controllers;

import java.security.Principal;

import com.pharma5.entities.User;
import com.pharma5.services.TaskService;
import com.pharma5.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
	
	@Autowired
	private TaskService taskService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/profile")
	public String showProfilePage(Model model, Principal principal) {
		
		String email = principal.getName();
		User user = userService.findOne(email);
		
		model.addAttribute("tasks", taskService.findUserTask(user));
		
		
		return "views/profile";
	}

}

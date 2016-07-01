package com.cjt.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjt.domain.User;
import com.cjt.service.IUserService;

/**
 * @author alun
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	public UserController() {
		System.out.println("UserController");
	}

	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model) {
		System.out.println("UserController showUser");
		int id = Integer.parseInt(request.getParameter("id"));  
        User user = userService.getUserById(id);  
        model.addAttribute("user", user);  
        return "showUser";  
	}
	
}

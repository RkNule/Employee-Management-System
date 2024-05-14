package com.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/if-unless")
	public String users(Model model) {
		List<User> users = new ArrayList<>();
		users.add(new User("Rohan","rk@gmail.com","ADMIN"));
		users.add(new User("Roman","regins@gmail.com","USER"));
		users.add(new User("Mahi","mahi@gmail.com","USER"));
		users.add(new User("Kiccha","kiccha@gmail.com","USER"));
		model.addAttribute("users", users);
		return "if-unless";
	}
	
	@GetMapping("/switch-case")
	public String switchExample(Model model) {
		User user = new User("Rohan","rk@gmail.com","ADMIN");
		model.addAttribute("user", user);
		return "switch-case";
	}

}

package com.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	
	@GetMapping("/iteration")
	public String iteration(Model model) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Rohan","Nule","rk@gmail.com"));
		employees.add(new Employee("Roman","Regins","regins@gmail.com"));
		employees.add(new Employee("Mahi","Dhoni","mahi@gmail.com"));
		employees.add(new Employee("Kiccha","Sudeep","kiccha@gmail.com"));
		model.addAttribute("employees", employees);
		return "iteration";
	}

}

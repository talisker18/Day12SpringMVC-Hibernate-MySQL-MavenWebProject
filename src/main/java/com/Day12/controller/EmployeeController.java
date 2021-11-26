package com.Day12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees") //start path with /departments
public class EmployeeController {

	@RequestMapping("/") //default route: if no path is defined, call this request mapping, returning welcome.jsp
	public String listEmployees() {
		return "employees";
	}
	
	@RequestMapping("/employee-add") //default route: if no path is defined, call this request mapping, returning welcome.jsp
	public String newEmployee() {
		return "employee-add";
	}
}

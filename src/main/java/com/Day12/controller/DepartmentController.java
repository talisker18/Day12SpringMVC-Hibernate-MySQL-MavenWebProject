package com.Day12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departments") //start path with /departments
public class DepartmentController {

	@RequestMapping("/") //default route: if no path is defined, call this request mapping, returning welcome.jsp
	public String getMessage() {
		return "welcome";
	}
}

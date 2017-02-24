package com.springtutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springtutorial.entity.Employee;
import com.springtutorial.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employee")
	public String getAllEmployees(ModelMap model) {
		List<Employee> listEmployees = employeeService.getAll();
		model.put("employees", listEmployees);
		return "list-employee";
	}

}

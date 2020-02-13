package com.javafullstacktraining.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javafullstacktraining.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee getEmployeeDetails() {

		Employee emp = new Employee();
		
		emp.setName("Ramu");
		emp.setDesignation("Manager");
		emp.setEmpId("111");
		emp.setSalary(30000);

		return emp;
	}

}

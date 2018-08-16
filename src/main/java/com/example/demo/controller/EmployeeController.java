package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeServices;

@RestController

//base url
@RequestMapping("/employee")

public class EmployeeController {

	@Autowired
	private EmployeeServices service;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {

		return service.getAllEmployees();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") int id) {
		return service.getEmployee(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee Employee) {
		service.addEmployee(Employee);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateEmployee(@PathVariable int id, @RequestBody Employee Employee) {
		service.updateEmployee(id,Employee);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		service.deleteEmployee(id);
	}

}


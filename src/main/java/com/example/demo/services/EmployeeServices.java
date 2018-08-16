package com.example.demo.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeServices
{
	private List<Employee> employees = new ArrayList<>(
			Arrays.asList(
					new Employee(101, "Anshul Garg", "band x"),
					new Employee(102, "Shubham Bansal", "band x"), 
					new Employee(103, "Nikhil Gupta", "band x"),
					new Employee(104, "Harvinder Singh", "band 1"), 
					new Employee(105, "Neeeraj Dubey", "band 0"),
					new Employee(106, "Shubham Pareek", "band 0")
				)
			);
	
	public List<Employee> getAllEmployees() {
		return employees;
	}

	public Employee getEmployee(int id) {

		Employee employee = employees.stream().filter(t -> t.getEmployee_id() == id).findFirst().get();
		return employee;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void updateEmployee(int id, Employee employee) {
		for(int i=0 ; i<employees.size() ; i++) {
			Employee employeeObj = employees.get(i);
			if(employeeObj.getEmployee_id() == id)
			{
				employees.set(i, employee);
			}
		}
	}

	public void deleteEmployee(int id) {
		for(int i=0 ; i<employees.size() ; i++) {
			Employee employee = employees.get(i);
			if(id == employee.getEmployee_id()) {
				employees.remove(i);
				break;
			}
		}
	}
}
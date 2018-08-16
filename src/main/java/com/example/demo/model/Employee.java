package com.example.demo.model;




public class Employee {



	//@GeneratedValue (strategy = GenerationType.AUTO)

	private Integer employee_id;
	private String name;
	private String band;

	
	public Employee(Integer employee_id, String name, String band) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.band = band;
	}

		
	public Integer getEmployee_id() {
		return employee_id;
	}
	
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBand() {
		return band;
	}
	
	public void setBand(String band) {
		this.band = band;
	}
	
}

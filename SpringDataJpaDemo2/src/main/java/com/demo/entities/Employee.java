package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Employee.getAllEmpBySal", query = "SELECT e FROM Employee e WHERE e.salary > :salary")
public class Employee {
	
	@Id
	private Long id;
	
	private String name;
	private String city;
	private Double salary;
	
	public Employee() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n\t\t [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	

}

package com.cs6310.a5rest.service;

import java.util.List;

import com.cs6310.a5rest.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int theID);
	public void save(Employee theEmployee);
	public void deleteByID(int theID);

}

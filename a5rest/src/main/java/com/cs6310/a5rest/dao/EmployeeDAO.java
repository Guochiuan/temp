package com.cs6310.a5rest.dao;

import java.util.List;

import com.cs6310.a5rest.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();

	public Employee findById(int theID);
	public void save(Employee theEmployee);
	public void deleteById(int theID);
}



package com.cs6310.a5rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs6310.a5rest.dao.EmployeeDAO;
import com.cs6310.a5rest.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll(){
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId){
		// TODO Auto-generated method stub
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeDAO.save(theEmployee);

	}

	@Override
	@Transactional
	public void deleteByID(int theID) {
		// TODO Auto-generated method stub
		employeeDAO.deleteById(theID);
	}

}

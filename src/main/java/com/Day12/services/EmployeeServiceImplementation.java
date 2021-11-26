package com.Day12.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day12.dao.EmployeeDAO;
import com.Day12.models.Employee;

@Service //inject this dependency in our controller
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO; //with autowired we do not have to create new object
	
	public void setEmployeeDAO(EmployeeDAO empDAO) {
		this.employeeDAO=empDAO;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		this.employeeDAO.addEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		this.employeeDAO.updateEmployee(employee);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		return this.employeeDAO.getEmployeeById(id);
	}

	@Override
	public void removeEmployee(int id) {
		this.employeeDAO.removeEmployee(id);
		
	}

	@Override
	public List<Employee> listEmployee() {
		return this.employeeDAO.listEmployee();
	}

}

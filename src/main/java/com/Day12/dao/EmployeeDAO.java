package com.Day12.dao;

import java.util.List;

import com.Day12.models.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public void removeEmployee(int id);
	
	public List<Employee> listEmployee();
}

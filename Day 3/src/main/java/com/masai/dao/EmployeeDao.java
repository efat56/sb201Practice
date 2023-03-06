package com.masai.dao;

import com.masai.day3.Employee;
import com.masai.exception.EmployeeException;

public interface EmployeeDao {
	
	void save(Employee emp);
	
	public String getAddressOfEmployee(int empId);
	
	public String giveBonusToEmployee(int empId, int bonus);
	
	public boolean deleteEmployee(int empId);
	 
	 public Employee registerEmployee(Employee employee)throws EmployeeException;


			

	
	

}

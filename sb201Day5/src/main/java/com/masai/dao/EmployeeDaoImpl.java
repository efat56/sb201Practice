package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> getAllEmployees() throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
		//Employee emp = null;
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		
		em.close();
		
		return employee;
	}

	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	

}

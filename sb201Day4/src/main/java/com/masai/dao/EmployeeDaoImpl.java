package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.Employee;
import com.masai.exception.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
	    EntityManagerFactory emf =	Persistence.createEntityManagerFactory("employeeUnit");
	    EntityManager em = emf.createEntityManager();
	   
	    
	    	 em.getTransaction().begin();
	    	 em.persist(employee);
	    	 
	    	 
	    	 em.getTransaction().commit();
	    	 System.out.println("registered successfully...");
	    	
	    
	   
	    em.close();
		return employee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee emp = null;
		EntityManagerFactory emf =	Persistence.createEntityManagerFactory("employeeUnit");
	    EntityManager em = emf.createEntityManager();
	    
	    emp = em.find(Employee.class, empId);
	    
	    if(emp != null) {
	    	return emp;
	    }
	    else {
	    	throw new EmployeeException("employee doen't exist with this id...");
	    }
		
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		
		Employee emp = null;
		EntityManagerFactory emf =	Persistence.createEntityManagerFactory("employeeUnit");
	    EntityManager em = emf.createEntityManager();
	    
	    emp = em.find(Employee.class, empId);
	    
	    if(emp != null) {
	    	em.getTransaction().begin();
	    	em.remove(emp);
	    	em.getTransaction().commit();
	    }
	    else {
	    	throw new EmployeeException("employee doesn't remove with this id...");
	    }
	    em.close();
		
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		Employee emp = null;
		EntityManagerFactory emf =	Persistence.createEntityManagerFactory("employeeUnit");
	    EntityManager em = emf.createEntityManager();
	    
	    emp = em.find(Employee.class, employee.getEmpId());
	    
	    if(emp != null) {
	    	em.getTransaction().begin();
	    	em.merge(employee);
	    	em.getTransaction().commit();
	    }
	    else {
	    	throw new EmployeeException("employee doesn't exist with this id...");
	    }
	    em.close();
		
		return emp;
	}

}

package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.masai.day3.Employee;
import com.masai.exception.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee emp) {
		EntityManagerFactory emf =	Persistence.createEntityManagerFactory("employeeUnit");
		 EntityManager em =   emf.createEntityManager();
		 
		 
		
		 
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		em.persist(emp);
		
		et.commit();
		
		System.out.println("done....");
		
		em.close();
		
		
		
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String message = null ;
		EntityManagerFactory emf =	Persistence.createEntityManagerFactory("employeeUnit");
		 EntityManager em =   emf.createEntityManager();
		 
		 Employee employee = em.find(Employee.class, empId);
			
			if(employee != null)
				message = employee.getAddress();
			else
				System.out.println("please enter valid empId");
			
			em.close();
		
		
		
		
		
		
		return message;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String s = null;
		EntityManagerFactory emf =	Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em =   emf.createEntityManager();
		
		 Employee employee = em.find(Employee.class, empId);
			
		 if(employee==null) {
			 System.out.println("employee does not found");
		 }else {
			 
			 
			 em.getTransaction().begin();
			 employee.setSalary(employee.getSalary()+bonus);
			 em.getTransaction().commit();
			 System.out.println("Updated...");
		 }
		 em.close();
		 System.out.println("Done....");
		
		
		
		return s;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean b = false;
		
		EntityManagerFactory emf =	Persistence.createEntityManagerFactory("employeeUnit");
		 EntityManager em =   emf.createEntityManager();
		 
		 
		 
		 
		 Employee emp  = em.find(Employee.class, empId);
		 
		 if(emp != null) {
			 em.getTransaction().begin();
		     em.remove(emp);
		     em.getTransaction().commit();
			 System.out.println("employee removed");
		 }else
			 System.out.println("employee not found....");
		 em.close();
		return true;
	}

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		employee = null;
		
		
		
		
		
		
		return employee;
	}
	
	

}

package com.masai.dao;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.day3.Employee;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp id");
		int id = sc.nextInt();
		
		System.out.println("Enter emp name");
		String name = sc.next();
		
		System.out.println("Enter emp address");
		String adr = sc.next();
		
		System.out.println("Enter emp salary");
		int salary = sc.nextInt();
		
		Employee e1 = new Employee(id,name,adr,salary);
		
		EmployeeDao ed = new EmployeeDaoImpl();
		ed.save(e1);
		System.out.println("Inserted successfully");
		
		

	}

}

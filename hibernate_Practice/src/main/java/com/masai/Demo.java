package com.masai;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
	EntityManagerFactory emf = 	Persistence.createEntityManagerFactory("studentUnit");
	
	 EntityManager em = emf.createEntityManager();
	 
	 Student s = new Student(13,"Rahul",750);
	 
	 
	 
	 em.getTransaction().begin();
	 em.persist(s);
	 
	 System.out.println("Done");
	 em.getTransaction().commit();
	 
	 em.close();
	 
//	 Scanner sc = new Scanner(System.in);
//	 
//	 System.out.println("enter roll number....");
//	 int roll = sc.nextInt();
//	 
//	  Student s =   em.find(Student.class,roll);
//	  
//	  if(s != null) {
//		  System.out.println(s);
//	  }
//	  else {
//		  System.out.println("student does not exist....");
//	  }
//	  
//	  em.close();

	}

}

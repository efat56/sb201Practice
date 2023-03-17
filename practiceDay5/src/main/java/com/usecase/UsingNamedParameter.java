package com.usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.EMUtility.EMUtil;

public class UsingNamedParameter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name....");
		String name = sc.next();
		
		System.out.println("enter balance...");
		int balance = sc.nextInt();
		
		EntityManager em = EMUtil.ProvideEntityManger();
		
		String jpql = "update Account set balance=balance+ :bal where name = :name";
		
		  Query q =   em.createQuery(jpql);
		  
		  q.setParameter("bal", balance);
		  q.setParameter("name",name);
		  
		  em.getTransaction().begin();
		  int x = q.executeUpdate();
		  em.getTransaction().commit();
		  
		  System.out.println(x + "rows updated...");
	}

}

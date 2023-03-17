package com.usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.EMUtility.EMUtil;

public class UsingPositionalParameter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account holder name....");
		String name = sc.next();
		
		System.out.println("Enter balance...");
		int balance = sc.nextInt();
		
		  EntityManager em = EMUtil.ProvideEntityManger();
		  
		  String jpql = "update Account set balance=balance+?1 where name = ?2";
		  
		 Query q =  em.createQuery(jpql);
		 
		 q.setParameter(1, balance);
		 q.setParameter(2, name);
		 
		 
		 em.getTransaction().begin();
		 int x = q.executeUpdate();
		 em.getTransaction().commit();
		 
		 System.out.println(x + "rows updated...");

	}

}

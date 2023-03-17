package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.EMUtility.EMUtil;
import com.model.Account;

public class GetAllDetails {

	public static void main(String[] args) {
		
	EntityManager em = EMUtil.ProvideEntityManger();
	
	String jpql = "select a from Account a ";
	
	 Query q =    em.createQuery(jpql);
	 
	   List<Account> list = q.getResultList();
	   
	   for(Account acc : list) {
		   System.out.println(acc);
	   }
	   
	   list.forEach(a -> System.out.println(a));
	

	}

}

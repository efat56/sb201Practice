package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.EMUtility.EMUtil;
import com.model.Account;

public class SearchOnNonPk {

	public static void main(String[] args) {
		
		EntityManager em =   EMUtil.ProvideEntityManger();
		
		String jpql = "select a from Account a where a.name = 'name2' ";
		
		 Query q = em.createQuery(jpql);
		 TypedQuery<Account> q2 = em.createQuery(jpql,Account.class);
		 
		 List<Account> list = q.getResultList();
		 
		 for(Account acc : list) {
			 System.out.println(acc);
		 }
		 
		 
		 // if we confirm only one result will come....
		 
		 Object obj = q.getSingleResult();
		 Account acc =(Account)obj;
		 
		Account a=(Account) q.getSingleResult();
		System.out.println(a);
		 
		Account acc =  q2.getSingleResult();
		System.out.println(acc);

		 


	}

}

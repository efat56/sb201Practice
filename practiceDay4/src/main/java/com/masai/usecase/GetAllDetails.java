package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class GetAllDetails {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "from Account";
		
		 Query q = em.createQuery(jpql);
		 
		List<Account> listAccount =  q.getResultList();
		
		
//		for(Account acc : listAccount) {
//			System.out.println(acc);
//		}
		
		
		listAccount.forEach(a -> System.out.println(a));
		
		

	}

}

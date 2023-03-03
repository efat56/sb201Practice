package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class GetAllDetails {

	public static void main(String[] args) {
		
		EntityManager em =  EMUtil.provideEntityManager();
		
		String jpql = "select a from Account a";
		
		Query q =  em.createQuery(jpql);
		
		 List<Account> accList =  q.getResultList();
		 
		 
		 for(Account acc : accList) {
			 System.out.println(acc);
		 }
		 
		 accList.forEach(a -> System.out.println(a));
	}

}

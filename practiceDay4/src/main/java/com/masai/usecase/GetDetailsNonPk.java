package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class GetDetailsNonPk {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "from Account where name like 'name2' ";
		
		
		   Query q =  em.createQuery(jpql);
		   
		List<Account> listAcc =  q.getResultList();
		
		
//		for(Account a : listAcc) {
//			System.out.println(a);
//		}
		
		listAcc.forEach(a -> System.out.println(a));

	}

}

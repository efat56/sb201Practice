package com.masai.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class GetDetailsNonPk {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "from Account where name like 'name2' ";
		
		
		   Query q =  em.createQuery(jpql);
		   
		List<Account> listAcc =  q.getResultList();
		
		
		for(Account a : listAcc) {
			System.out.println(a);
		}
		
		listAcc.forEach(a -> System.out.println(a));
		
		
        // if we sure only one list will be come than we will use 
		
		
		String jpql2 = "select a from Account a where a.name = 'name3' ";
		
		Query q2 =   em.createQuery(jpql2);
		
		Object obj =    q2.getSingleResult();
		
		Account acc = (Account)obj;
		
		Account acc2=(Account)q.getSingleResult();
		
		System.out.println(acc);
		
		
		TypedQuery< Account> tq =     em.createQuery(jpql,Account.class);
		
		Account acc3 =   tq.getSingleResult();
		
		System.out.println(acc3);
	}

}

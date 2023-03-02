package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account account) {
		boolean flag = false;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		flag=true;
		em.close();
		
		return flag;
	}

	@Override
	public boolean deleteAccount(int accno) {
       boolean flag = false;
       Account account = null;
		
		EntityManager em =   EMUtil.provideEntityManager();
		
		account =em.find(Account.class,accno);
		
		if(account != null) {
			em.getTransaction().begin();
			em.remove(account);
			em.getTransaction().commit();
			flag=true;
		}
		else {
			System.out.println("account not found....");
		}
		em.close();
		
		
		
		
		
		return flag;
	}

	@Override
	public boolean updateAccount(Account account) {
		boolean flag = false;
		
		EntityManager em =   EMUtil.provideEntityManager();
		
		//account =em.find(Account.class,account.getAccNo());
		
		if(account != null) {
			em.getTransaction().begin();
			em.merge(account);
			em.getTransaction().commit();
			flag=true;
		}
		else {
			System.out.println("account not found....");
		}
		em.close();
		
		
		
		
		
		return flag;
	}

	@Override
	public Account findAccount(int accno) {
		Account acc = null;
		EntityManager em = EMUtil.provideEntityManager();
		acc=em.find(Account.class, accno);
		
		if(acc != null) {
			return acc;
		}else {
			System.out.println("account not found with this accNo...");
		}
		
		em.close();
		
		
		
		return acc;
	}

}

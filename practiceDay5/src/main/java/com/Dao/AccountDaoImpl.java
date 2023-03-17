package com.Dao;

import javax.persistence.EntityManager;

import com.EMUtility.EMUtil;
import com.model.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account account) {
		
		boolean b = false;
		
		
		 EntityManager em = EMUtil.ProvideEntityManger();
		 
		 em.getTransaction().begin();
		 em.persist(account);
		 b=true;
		 em.getTransaction().commit();
		 
		 
		 em.close();
		 
		return b;
	}

	@Override
	public boolean deleteAccount(int accno) {
		boolean flag = false;
		EntityManager em =   EMUtil.ProvideEntityManger();
		Account acc = null;
		acc = em.find(Account.class, accno);
		 if(acc != null) {
			 em.getTransaction().begin();
			 em.remove(acc);
			 flag=true;
			 em.getTransaction().commit();
		 }else {
			 System.out.println("account does not exist with this id....");
		 }
		return flag;
	}

	@Override
	public boolean updateAccount(Account account) {
		boolean b = false;
		
		EntityManager em = EMUtil.ProvideEntityManger();
		
		Account acc = null;
		
		acc = em.find(Account.class, account.getAccNo());
		
		
		if(acc != null) {
			
			em.getTransaction().begin();
			em.merge(account);
			b=true;
			em.getTransaction().commit();
			
			
		}else {
			System.out.println("doesn't exist...");
		}
			
		
		em.close();
		
		return b;
	}

	@Override
	public Account findAccount(int accno) {
		
		Account acc = null;
		 EntityManager em =   EMUtil.ProvideEntityManger();
		 
		acc =  em.find(Account.class, accno);
		
		if(acc == null) {
			
			System.out.println("Account does not exist");
			
		}
		else {
			return acc;
		}
		
		return acc;
		 
		 
		
	}

}

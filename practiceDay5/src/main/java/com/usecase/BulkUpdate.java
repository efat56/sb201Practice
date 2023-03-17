package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.EMUtility.EMUtil;
import com.model.Account;

public class BulkUpdate {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.ProvideEntityManger();
		
		String jpql = "update Account set balance=balance+500";
		
		Query q = em.createQuery(jpql);
		
		em.getTransaction().begin();
		int x = q.executeUpdate();
		em.getTransaction().commit();
		
		System.out.println("row updated " +x);
		
		
		
		
		
		
		
	}

}

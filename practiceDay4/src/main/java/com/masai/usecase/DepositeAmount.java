package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.model.Account;

public class DepositeAmount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter account number....");
		int accNo = sc.nextInt();
		
		
		
		
		AccountDao aDao = new AccountDaoImpl();
		Account acc = aDao.findAccount(accNo);
		
		if(acc != null) {
			
			System.out.println("enter amount....");
			int amt = sc.nextInt();
			
			acc.setBalance(acc.getBalance()+amt);
			
		boolean f =	aDao.updateAccount(acc);
		if(f) {
			System.out.println("deposite successfully...");
		}
		else {
			System.out.println("Technical errors...");
		}
			
			
		}
		else {
			System.out.println("Account doesn't exist....");
		}

	}

}

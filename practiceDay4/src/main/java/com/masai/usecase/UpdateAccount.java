package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.model.Account;

public class UpdateAccount {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("enter account number...");
 		int accNo= sc.nextInt();
		
		System.out.println("enter account holder name...");
		String name = sc.next();
		
		
		System.out.println("enter account holder balance...");
		int balance = sc.nextInt();
		
		Account acc = new Account();
		acc.setAccNo(accNo);
		acc.setName(name);
		acc.setBalance(balance);
		
		AccountDao aDao = new AccountDaoImpl();
		
		boolean b =aDao.updateAccount(acc);
		System.out.println(b);
	}

}

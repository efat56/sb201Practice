package com.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;
import com.model.Account;

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

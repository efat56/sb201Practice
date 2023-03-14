package com.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;
import com.model.Account;

public class CreateAccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name...");
		String name = sc.next();
		
		System.out.println("enter amount...");
		int balance = sc.nextInt();
		
		Account acc = new Account();
		acc.setName(name);
		acc.setBalance(balance);
		
		AccountDao aDao = new AccountDaoImpl();
		
		 boolean b =   aDao.createAccount(acc);
		 
		 System.out.println(b);
		

	}

}

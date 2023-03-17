package com.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;
import com.model.Account;

public class FindAccount {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	         
	         System.out.println("enter account number...");
	 		int accNo= sc.nextInt();
	 		
	 		Account acc = new Account();
	 		
	 		AccountDao aDao = new AccountDaoImpl();
	 		acc = aDao.findAccount(accNo);
	 		System.out.println(acc);

	}

}

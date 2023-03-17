package com.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;


public class DeleteAccount {

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	         
	         System.out.println("enter account number...");
	 		int accNo= sc.nextInt();
	 		
	 		
	 		
	 		AccountDao aDao = new AccountDaoImpl();
	 		boolean b = aDao.deleteAccount(accNo);
	 		System.out.println(b);


	}

}

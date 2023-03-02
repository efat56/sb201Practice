package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.model.Account;

public class DeleteAccount {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number...");
		int accNo = sc.nextInt();
		
		AccountDao aDao = new AccountDaoImpl();
		boolean  b =aDao.deleteAccount(accNo);
		
		System.out.println(b);
	}

}

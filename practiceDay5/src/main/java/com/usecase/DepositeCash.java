package com.usecase;

import java.util.Scanner;

import com.Dao.AccountDao;
import com.Dao.AccountDaoImpl;
import com.model.Account;

public class DepositeCash {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number....");
		int accNo = sc.nextInt();
		
		
		
		AccountDao aDao = new AccountDaoImpl();
		
		Account acc = aDao.findAccount(accNo);
		
		if(acc != null) {
			System.out.println("enter amount want to deposite");
			int amt = sc.nextInt();
			
			acc.setBalance(acc.getBalance()+amt);
			
			boolean flag = aDao.updateAccount(acc);
			
			if(flag) {
				System.out.println("deposite successfully....");
			}
			else {
				System.out.println("Technical problem....");
			}
			
		}else {
			System.out.println("Account does not exist with this account number...");
		}
		
		
		
		
		
		

	}

}

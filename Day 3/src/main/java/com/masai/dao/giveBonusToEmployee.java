package com.masai.dao;

import java.util.Scanner;

public class giveBonusToEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId");
		int id = sc.nextInt();
		
		System.out.println("Enter bonus amount");
		int b = sc.nextInt();
		
		EmployeeDao  ed3 = new EmployeeDaoImpl();
		String s =ed3.giveBonusToEmployee(id, b);
		System.out.println(s);

	}

}

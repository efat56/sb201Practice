package com.masai.dao;

import java.util.Scanner;

import com.masai.day3.Employee;

public class getAddressOfEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter empId");
		int id = sc.nextInt();
		
		Employee e2 = new Employee();
		EmployeeDao ed2 = new EmployeeDaoImpl();
		String message =ed2.getAddressOfEmployee(id);
		
		System.out.println(message);

	}

}

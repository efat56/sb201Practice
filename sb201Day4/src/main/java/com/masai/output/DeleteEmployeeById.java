package com.masai.output;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class DeleteEmployeeById {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter empId...");
		int id = sc.nextInt();
		
		EmployeeDao eDao = new EmployeeDaoImpl();
		try {
			System.out.println(eDao.deleteEmployeeById(id));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}

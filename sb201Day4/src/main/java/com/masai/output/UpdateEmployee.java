package com.masai.output;

import java.util.Scanner;

import com.masai.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class UpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee empId..");
         int empId  = sc.nextInt();
		
		System.out.println("Enter Employee Name..");
		String name = sc.next();
		
		System.out.println("Enter Employee Address..");
		String addr = sc.next();
		
		System.out.println("Enter Employee Salary..");
		int salary  = sc.nextInt();
		
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setName(name);
		emp.setAddress(addr);
		emp.setSalary(salary);
		
		EmployeeDao eDao = new EmployeeDaoImpl();
		try {
			System.out.println(eDao.updateEmployee(emp));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}

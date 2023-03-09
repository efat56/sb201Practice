package com.evel5que1;

public class Loan {
    public double calculateLoanAmount(Employee employeeObj){
       if(employeeObj instanceof PermanentEmployee){
           return employeeObj.getSalary();

       } else if (employeeObj instanceof TemporaryEmployee) {
           return employeeObj.getSalary();

       }
       return 0;
    }
}

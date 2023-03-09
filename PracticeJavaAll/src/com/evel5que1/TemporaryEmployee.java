package com.evel5que1;

public class TemporaryEmployee extends Employee{

    private int hoursWorked;
    private int hourlyWages;

    @Override
     void calculateSalary(){
        salary = hoursWorked*hourlyWages;
        System.out.println("Temporary Employee Salary : "+salary);

    }
}

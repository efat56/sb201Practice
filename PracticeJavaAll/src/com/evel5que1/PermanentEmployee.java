package com.evel5que1;

public class PermanentEmployee extends Employee{

    private  double basicPay;

    @Override
     void calculateSalary(){
        double pfAmount = basicPay*0.12;


        salary = basicPay-pfAmount;
        System.out.println("Permanent Employee Salary is :"+salary);



    }

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }
    PermanentEmployee(){

    }
}

package com.evel5que1;

public class Main {

    public static void main(String[] args) {
        Loan loan = new Loan();
        double permanentEmployeeLoan = loan.calculateLoanAmount(new PermanentEmployee(1234,"Efat",15000));
        double temporaryEmployeeLoan = loan.calculateLoanAmount(new TemporaryEmployee());
        PermanentEmployee p = new PermanentEmployee();
        p.setSalary(20000);
        p.calculateSalary();

        System.out.println("Loan amount for Permanent Employee : "+permanentEmployeeLoan);
        System.out.println("Loan amount for Temporary Employee : "+temporaryEmployeeLoan);
    }
}

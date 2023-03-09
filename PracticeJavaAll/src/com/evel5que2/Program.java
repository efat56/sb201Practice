package com.evel5que2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Get user input DOB");
        String dob = sc.next();

        try{
            LocalDate dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            // get today date....
            LocalDate currDate = LocalDate.now();

            // get the difference between two date...

            Period period = Period.between(dateOfBirth,currDate);

           // int age = Math.abs(period.getYears());

            if(period.getYears()>=18){
                System.out.println("HAPPY BIRTHDAY TO YOU AND YOU ARE ELIGIBLE FOR VOTE");


            }
            if(period.getYears()>=18){
                System.out.println("You are Eligible for vote ");
            }
            else {
                System.out.println("you are not eligible for vote");
            }
        }catch (Exception e){
            System.out.println("please enter the valid date of birth");
        }


    }
}

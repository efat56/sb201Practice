package com.Day15Que2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.*;

public class Demo {

    public boolean validate(String name, String mobileNum, String aadhar){

        if(name.matches("[a-zA-Z]")&& mobileNum.matches("[6789]\\d{9}") && aadhar.matches("[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}")){
            return true;
        }
        else{
            return false;
        }



    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Citizen citizen = new Citizen();



            System.out.println("Enter name");
            citizen.setName(sc.nextLine());

            System.out.println("Enter a mobile number starting with 6789");
            citizen.setMobileNumber(sc.nextLine());

            System.out.println("Enter aadhar Number xxxx xxxx xxxx ");
            citizen.setAadharNumber(sc.nextLine());

            Demo d = new Demo();

            if (d.validate(citizen.getName(), citizen.getMobileNumber(), citizen.getAadharNumber())) {
                System.out.println("Name :" + citizen.getName());
                System.out.println("Mobile Number :" + citizen.getMobileNumber());
                System.out.println("Aadhar Number :" + citizen.getAadharNumber());
            } else {
                System.out.println("Invalid");
            }





    }


}

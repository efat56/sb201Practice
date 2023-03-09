package com.Day15Que4;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        int number;
        Scanner sc= new Scanner(System.in);
       // while (true){
            System.out.println("Enter the Integer ");
            try{
                number = Integer.parseInt(sc.next());
                number=number*number;
                System.out.println("The square value is "+number);
                System.out.println("The work has been done successfully");
               // break;
            }
            catch (NumberFormatException nfe){
                System.out.println("Entered input is not a valid format for an integer");

            }
       }

   // }
}

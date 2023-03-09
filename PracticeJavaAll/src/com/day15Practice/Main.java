package com.day15Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            String s = sc.next();

            int num = Integer.parseInt(s);
            num=num*num;
            System.out.println("The square is:"+num);
            System.out.println("the square is successful");

        }catch (NumberFormatException npe){
            System.out.println("Entered input is not a valid format for an integer");
        }







//       try {
//           System.out.println("Enter a num1");
//           String num1 = sc.next();
//
//           System.out.println("Enter a num2");
//           String num2 = sc.next();
//
//           int n = Integer.parseInt(num1);
//           int n2 = Integer.parseInt(num2);
//
//           int n3 = n / n2;
//
//           if (n3 > 5) {
//               System.out.println("the answer is " + n3);
//           } else {
//               System.out.println("wrong answer");
//           }
//
//       }catch (NumberFormatException npe){
//           System.out.println("Enter valid number");
//       }

    }
}

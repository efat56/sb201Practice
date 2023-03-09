package com.practiceCode;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc --!=0){
            int a = sc.nextInt();
            int sum = 0;
            while(a !=0){
                int temp = a%10;
                sum+=temp;
                a/=10;
            }
            System.out.println(sum);


        }
    }
}

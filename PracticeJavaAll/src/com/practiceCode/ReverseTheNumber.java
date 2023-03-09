package com.practiceCode;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
       //int t = Integer.parseInt(bi.readLine());

        while(t--!=0){

            int num = sc.nextInt();
          //int num = Integer.parseInt(bi.readLine());
            int output = 0;
           // int size = String.valueOf(num).length();
            int size = String.valueOf(num).length();
           // System.out.println(size);

//            for(int n=size-1; n>=0; n--){
//
//                int q = (int)(num/Math.pow(10, n));
//                output +=  q * Math.pow(10, size-n-1);
//
//                num = num % (int)Math.pow(10, n);
//
//            }

            for(int i=size-1; i>=0; i--){
               int q =  (int)(num/Math.pow(10,i));
                System.out.println(q);
                output+=q*Math.pow(10,size-i-1);
                num=num%(int)Math.pow(10,i);
            }

            System.out.println(output);

        }
    }
}

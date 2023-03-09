package com;

import java.util.Scanner;

public class PracticeLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number here");
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//            System.out.print(i);
//        }
        //find the largest number of 3
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        int max = a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}

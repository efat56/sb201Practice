package com.thread;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        //int sum = 0;

        while (tc -->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

           int sum = a+b;
            System.out.println(sum);
        }

    }
}

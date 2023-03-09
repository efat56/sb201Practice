package com;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit name");
        String fruit = sc.next();

        switch (fruit) {
            case "Apple" -> System.out.println("A sweet red fruit");
            case "mango" -> System.out.println("King of fruit");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("please enter valid fruit name");
        }
    }
}

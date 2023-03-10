package com.eval;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of passenger");
        int s = sc.nextInt();


        System.out.println("Enter number of KMs");
        int t = sc.nextInt();

        OLA ola = new OLA();
        Car car=ola.bookCar(s,t);
        int result=ola.calculateBill(car);
        System.out.println("the total fare amount :"+result);


//        Sedan sedan = new Sedan();
//        int pq = sedan.farePerKm;
//        System.out.println("pq :"+pq);  //20

//        sedan.setNumberOfKms(100);
//        sedan.setNumberOfPassenger(20);
//        int s = sedan.getNumberOfKms();
//        int y = sedan.getNumberOfPassenger();






    }
}

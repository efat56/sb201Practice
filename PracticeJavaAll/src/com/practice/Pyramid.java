package com.practice;

public class Pyramid {
    public void print(int n){



    }

    public static void main(String[] args) {
        Pyramid py = new Pyramid();
        py.print(4);
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}

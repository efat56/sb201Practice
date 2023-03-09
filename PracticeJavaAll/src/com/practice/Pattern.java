package com.practice;

public class Pattern {
    /*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
     */

    int N=5;

    public void pattern(int N){

        for(int i =0; i<N; i++){
            String bag = "";
            for(int j=0; j<N; j++){
                bag+="*"+" ";

            }
            System.out.println(bag);

        }
    }

    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.pattern(5);
    }
}

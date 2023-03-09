package com.practice;

public class Pattern2 {
    /*
    *
    * *
    * * *
    * * * *
    * */

    public void patternStar(int n){
        for(int i=0; i<n; i++){
            String bag = "";
            for(int j = 0; j<=i; j++){
                bag+="*"+" ";
            }
            System.out.println(bag);
        }

    }

    public static void main(String[] args) {
        Pattern2 p2 = new Pattern2();
        p2.patternStar(5);
    }
}

package com;

public class Reverse {
    public static void main(String[] args) {
        int n = 98765;
        int ans = 0;

        while(n>0){
            int r = n % 10;
            n /= 10;
            ans=ans*10+r;



        }
        System.out.println(ans);

    }
}

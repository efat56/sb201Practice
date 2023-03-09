package com.practice;

public class Prime {
    int count = 0;

    public  void prime(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }

    public static void main(String[] args) {
        Prime pr = new Prime();
        pr.prime(13);
    }
}

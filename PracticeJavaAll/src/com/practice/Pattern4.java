package com.practice;

public class Pattern4 {
    public  void patternPs(int n){
        for(int i=0; i<=n; i++)
        {
            String bag = "";
            for(int j=i+2; j<=n; j++)
            {
                bag+="*";
            }
            System.out.println(bag);
        }
    }

    public static void main(String[] args) {
        Pattern4 p4 = new Pattern4();
        p4.patternPs(9);
    }
}

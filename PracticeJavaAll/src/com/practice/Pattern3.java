package com.practice;

public class Pattern3 {
    public static void main(String[] args) {
//        Pattern3 p3 = new Pattern3();
//        p3.PatternStar2(5);
        Pattern3.pattern3(5);
       Pattern3.pattern4(5);
        Pattern3.pattern5(5);
    }

//    public  void PatternStar2(int n){
//       for(int i=0; i<n; i++){
//           for(int j=0; j<i; j++){
//               System.out.print("* ");
//           }
//           System.out.println();
//
//
//       }
//
//    }

    public static void pattern3(int n){
        for(int i=0; i<n; i++){
            for(int j =i; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int i=0; i<=2*n; i++){
            int totalCol = i>n ? 2*n-i:i;
            int noOfSpace = n-totalCol;
            for(int s=0;s<noOfSpace;s++){
                System.out.print(" ");
            }
            for(int j = 0; j<totalCol;j++){
                System.out.print("* ");
            }
            System.out.println();



        }
    }




}

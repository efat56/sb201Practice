//package com.Day1;
//
//import java.util.Arrays;
//
//public class Main {
//
//    public int[] findAndReturnPrimeNumbers(int[] inputArray) {
//        int count=0;
//        int p=0;
//        int [] number=new int [inputArray.length];
//        for(int j=0;j<inputArray.length;j++){
//            for(int i=1; i<inputArray[j]; i++ ){
//                if(inputArray[j]%i==0){
//                    count++;
//                }
//            }
//            if(count==2){
//                number[p++]=inputArray[j];
//            }
//        }
//
//        return number;
//
//    }
//
//    public static void main(String[] args) {
//        Main m = new Main();
//        int[] arr = {10, 12, 5, 50, 11, 14, 15};
//
//        if(m.findAndReturnPrimeNumbers(arr)==null){
//            System.out.println("number is not prime");
//
//        }else{
//            System.out.println(m.findAndReturnPrimeNumbers(Arrays.toString(int[] arr)));
//        }
//
//    }
//}
//

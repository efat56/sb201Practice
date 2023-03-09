package com.binarySearch;

public class CeilingSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,17,17,18};
        int target = 17;
        int out = Ceiling(arr,target);
        System.out.println(out);
    }



    public static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            // find the middle element
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1 ;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return  start ;
    }
}

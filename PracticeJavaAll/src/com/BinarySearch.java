package com;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,2,4,4,5,5,7,7,9,10};
        int target = 7;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;

        //return index
        // return -1 if it does not exist

        while (start<=end){
            //find the middle element
            int mid = start+(end-start)/2;

            if(target < arr[mid]){
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}

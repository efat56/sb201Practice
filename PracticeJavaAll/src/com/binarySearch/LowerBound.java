package com.binarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,6,7,8,8,9,10};
        int k = 8;
        int out = Lower(arr,k);
        System.out.println(out);
    }


    public static int Lower(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==k){
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid]>k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}

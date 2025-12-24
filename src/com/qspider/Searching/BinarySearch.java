package com.qspider.Searching;

public class BinarySearch {
    public static void main(String Args[]){
        int[] arr={8,9,11,36,54,55};
        System.out.println(binarySearch(arr,9));
    }
    public static int binarySearch(int[] arr,int x ){
        int l=0;
        int r = arr.length-1;
        while(l<r){
            int m=(l+r)/2;
            if(x==arr[m]){
                return m;
            }
            if(x>arr[m]){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        if(arr[l]==x){
            return l;
        }
        return -1;
    }
}

package com.qspider.Sorting;

public class SelectionSortAlgo {
    public static void main(String[] args){
        int[] nums = {10,8,27,36,15};
        selectionSort(nums);
    }
    public static void selectionSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                   int temp =nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;
                }
            }
        }

        printArr(nums);
    }

    public static void printArr(int[] nums){
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}

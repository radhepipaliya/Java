package com.qspider.Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] nums={10,8,27,36,15};
        bubbleSort(nums);
        for(int i: nums){
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            boolean isSwaped=false;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]= temp;
                    isSwaped=true;
                }
            }
            if(!isSwaped)
                break;
        }
    }
}

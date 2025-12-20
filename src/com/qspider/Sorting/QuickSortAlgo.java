package com.qspider.Sorting;

public class QuickSortAlgo {

    public static void main(String[] args){
        int[] nums ={9,7,69,63,28,15,20};
        quickSort(nums,0,nums.length-1);
        for(int i:nums){
            System.out.print(i+" ");
        }

    }

    public static void swap(int[] nums , int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }

    public static int getPivotIndex(int[] nums, int l , int h){
            int pi=nums[h];
            int i=l;
            while(l<h){
                if(nums[l]<pi){
                    swap(nums,l,i);
                    i++;
                }
                l++;
            }
        swap(nums,i,h);
        return i;
    }

    public static void quickSort(int[] nums,int l ,int h){
        if(l<h){
            int pivot = getPivotIndex(nums,l,h);
            quickSort(nums,l,pivot-1);
            quickSort(nums,pivot+1,h);
        }
    }
}

package com.qspider.DSA;

public class Shuffle {

    public static void main(String[] args){
        int[] nums ={2,5,1,3,4,7};
        printArray(shuffleTheArray(nums,3));

    }

    public static int[] shuffleTheArray(int [] nums,int k){
        int n =nums.length;
        int[] ans = new int[n];
        int i=0;
        int j=1;

        while(i<k&&j<n){
            ans[i] = nums[i];
            ans[j] =nums[j+k];
            i++;
            j++;
        }
        return ans;

    }
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

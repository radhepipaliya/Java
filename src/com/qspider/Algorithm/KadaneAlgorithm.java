package com.qspider.Algorithm;

public class KadaneAlgorithm {
    public static void main(String[] args){
        int[] nums = {1};
        System.out.println(kadenAlgo(nums));
    }

    public static int kadenAlgo(int[] nums){
       int res = 0;
       int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            res +=nums[i];
            maxSum = Math.max(maxSum,res);
            if(res<0){
                res=0;
            }

        }
        return maxSum;
    }
}

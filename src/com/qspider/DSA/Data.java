package com.qspider.DSA;

public class Data {
    public static void main(String[] args){
        int[] nums=new int[]{5,1,4,2,3};
//        printArray(speedoMeter(nums,9));

        System.out.println(findSumOfMax(nums));
    }

    public static int[] speedoMeter(int[] nums,int x){
        int n= nums.length-1;
        int size=nums.length+1;
        for(int i=n;i>=0;i--){
            if (nums[i] <= 9-x) {
                nums[i]+=x;
                return nums;
            }else{
                int sum =nums[i]+x;
                int mod = sum%10;
                nums[i]=mod;
                x = 1;
            }
        }
        int[] num1 = new int[size];
        num1[0] = 1;
        int temp= nums[n];
        num1[num1.length-1]=temp;
        return num1;
    }

    public static int findSumOfMax(int[] nums){
        int n = nums.length-1;
        int max1 = 0,max2=0,max3=0;

        for(int i=0;i<=n;i++){
            max1 = Math.max(max1,nums[i]);
        }
        for(int i =0;i<=n;i++) {
            if (nums[i] !=max1){
                max2 = Math.max(max2, nums[i]);
            }
        }
        for(int i =0;i<=n;i++) {
            if (nums[i] !=max1&& nums[i]!=max2){
                max3 = Math.max(max3, nums[i]);
            }
        }

        return max1+max2+max3;
    }

    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

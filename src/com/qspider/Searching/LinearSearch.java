package com.qspider.Searching;

public class LinearSearch {
    public static void main(String[] args){
    int[] nums ={10,55,16,22,36,45,22,15,96,47,25,32,51,25,12,36,95,100};
    System.out.println(linearSearch(nums,96));
    }

    public static int linearSearch(int[] nums,int x){
        for(int i=0; i<nums.length;i++){
            if(nums[i]==x) {
                return i;
            }
        }
        return -1;
    }
}

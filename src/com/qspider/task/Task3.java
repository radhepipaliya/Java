package com.qspider.task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        int[] arr ={10,50,1,4,125,124,523,89,8,56,45,12,2,17,8,6,54,114,5415,9,52,14,8};
//        System.out.println(largestElement(arr));
//        System.out.println(smallestElement(arr));
//        System.out.println(sumOfAllElement(arr));
//        System.out.println(avgOfArray(arr));
//        oddAndEvenInArray(arr);
//        printArray(copyArray(arr));
//        createArray();
//        System.out.println(linearSearch(arr,52));
        printArray(reverseArray(arr));

    }
//1. Write a Java program to find the largest element in an array.
    public static int largestElement(int[] nums) {
        int max = nums[0];
        for (int x : nums) {
            if (max < x) {
                max = x;
            }
        }
        return max;
    }
// 2. Write a Java program to find the smallest element in an array.
    public static int smallestElement(int [] nums){
        int min = nums[0];
        for(int x  : nums){
            if(min > x){
                min = x;
            }
        }
        return min;
    }
//    3. Write a Java program to calculate the sum of all elements in an array.

    public static int sumOfAllElement(int[] nums){
        int sum = 0;
        for(int x : nums){
            sum +=x;
        }
        return sum;
    }

//    4. Write a Java program to calculate the average of array elements.
    public static double avgOfArray(int[] nums){
        int n = nums.length;
        int sum = 0;
        for(int x : nums){
            sum +=x;
        }

        return (double) sum /n;
    }
//    5. Write a Java program to count the number of even and odd numbers in an array.
    public static void oddAndEvenInArray(int[] nums){
        int odd =0;
        int even =0;

        for(int x: nums){
            if(x%2==0){
                even ++;
            }else{
                odd++;
            }
        }

        System.out.println("Odd: "+odd+"\n"+"Even: "+even);
    }

//    6. Write a Java program to copy all elements of one array into another array
    public static int[] copyArray(int[] nums){
        int n= nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++ ){
            arr[i] = nums[i];
        }
        return arr;
    }

    public static void printArray(int[] nums){
        for(int x : nums){
            System.out.print(x+" ");
        }
    }
// miscellaneous
    public static void createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size =sc.nextInt();
        int[] nums = new int[size];

        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        printArray(nums);

    }

//    7. Write a Java program to search an element in an array (linear search).
    public static int linearSearch(int[] nums,int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == k){
                return i;
            }
        }
        return -1;
    }

//    8. Write a Java program to reverse an array.
    public static int[] reverseArray(int[] nums){
        int i=0;
        int j=nums.length;

        while(j<i){
            int temp = nums[i];
            nums[i] =nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

        return nums;
    }
}
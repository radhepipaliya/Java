package com.qspider.task;

public class Arrays {
    public static void main(String[] args){
           int[] arr= new int[]{1,0,3,0,5};
        int[] arrs= new int[]{1,2,3,4,5};
           /* System.out.println("Largest:"+largestElementInArray(arr));
            System.out.println("Smallest:"+smallestElementInArray(arr));
            System.out.println("Sum Of all:"+sumOfAllElementInArray(arr));
            System.out.println("Average of :"+avgOfArray(arr));
            evenAndOddInArray(arr);
            printArray(copyElement(arr));
            linearSearch(6,arr);
            reverseArray(arr);*/
        /*int[] res=mergeArray(arr,arrs);
        printArray(res);*/

        rotate(arr,3);

        /*sumof(arr);*/
        /*mul(arr);*/
    }
  /*  1. Write a Java program to find the largest element in an array.*/
    public static int largestElementInArray(int[] arr){
        int largest = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    /*2. Write a Java program to find the smallest element in an array.*/

    public static int smallestElementInArray(int[] arr){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }

    /*3. Write a Java program to calculate the sum of all elements in an array.*/

    public static int sumOfAllElementInArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    /*4. Write a Java program to calculate the average of array elements.*/

    public static double avgOfArray(int[] arr){
        return (double) sumOfAllElementInArray(arr) /arr.length;

    }

    /* Write a Java program to count the number of even and odd numbers in an array*/

    public static void evenAndOddInArray(int[] arr){
        int even=0,odd=0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2==0){
                even+=1;
            }else{
                odd+=1;
            }
        }
        System.out.println("Even:"+even);
        System.out.println("Odd :"+odd);
    }

    /* Write a Java program to copy all elements of one array into another array.*/

    public static int[] copyElement(int[] arr){
        int[] newArray = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArray[i]=arr[i];
        }
        return newArray;
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    /*Write a Java program to search an element in an array (linear search).*/
    public static void linearSearch(int a,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println("Element "+ a +" Found at Index:"+i);
            }
        }
    }

    /*Write a Java program to reverse an array.*/
    public static void reverseArray(int[] arr,int i,int j){

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        printArray(arr);
    }



    /*public static int[] mergeArrayTwo(int arr[],int arrs[]){
        int[] res = new int[arr.length + arrs.length];
        int a=0,b=1;
        for(int i=0;i<res.length;i++){

        }
    }*/

    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k);
        reverseArray(nums,k+1,nums.length-1);
        printArray(nums);
    }



//    public static void mul(int[] nums){
//        int[] res = new int[5];
//        /*int ans=1;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=0) {
//                ans *= nums[i];
//            }else{
//                ans*=1;
//            }
//        }
//        for(int j=0;j<nums.length;j++){
//            if(nums[j]!=0) {
//                nums[j] = ans / nums[j];
//            }else{
//                nums[j]=ans;
//            }
//        }
//        printArray(nums);
//    }*/
//
//        int pf = 1;
//        for(int i=0;i<nums.length;i++){
//        }



}
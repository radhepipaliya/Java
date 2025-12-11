package com.qspider.task;

public class Arrays {
    public static void main(String[] args){
           int[] arr= new int[]{1,2,3,4,5,6};
          /*  System.out.println(largestElementInArray(arr));
            System.out.println(smallestElementInArray(arr));
            System.out.println(sumOfAllElementInArray(arr));
            System.out.println(avgOfArray(arr));
            evenAndOddInArray(arr);
            printArray(copyElement(arr));
            linearSearch(6,arr);*/
            reverseArray(arr);
    }
  /*  1. Write a Java program to find the largest element in an array.*/
    public static int largestElementInArray(int[] arr){
        int largest = arr[0];
        for(int i=0; i<arr.length;i++){
            if(largest>arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }

    /*2. Write a Java program to find the smallest element in an array.*/

    public static int smallestElementInArray(int[] arr){
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(smallest<arr[i]){
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
    public static void reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(j>i){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        printArray(arr);
    }
}

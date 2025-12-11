package com.qspider.Arrayss;
import java.util.Scanner;
public class Arr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of an array");
        int n=sc.nextInt();
        int[] s=new int[n];

        System.out.println("Enter Input  of an array");
// For taking the input form user
        inputArray(s);
// For printing the array
        printArray(s);

    }

    public static int[] createIntArray(int n){
        Scanner sc= new Scanner(System.in);
        return new int[n];
    }

    public static void inputArray(int[] arr){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void printArray(int[] arr){

        for (int j : arr) {
            System.out.println(j);
        }

    }


}

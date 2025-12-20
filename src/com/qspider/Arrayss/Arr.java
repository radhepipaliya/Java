package com.qspider.Arrayss;
import java.util.Scanner;
public class Arr {
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Size of an array");
//        int n=sc.nextInt();
//        int[] s=new int[n];

        /*System.out.println("Enter Input  of an array");
// For taking the input form user
        inputArray(s);
// For printing the array
        printArray(s);*/

//        int[] nums=createIntArray();
        int[] nums= new int[]{1,2,3,4,5};
        mulOfElement(nums);

    }

    public static int[] createIntArray(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] nums=new int[n-1];
        System.out.println("Enter The input values of array");
        return inputArray(nums);
    }

    public static int[] inputArray(int[] arr){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){

        for (int j : arr) {
            System.out.println(j);
        }

    }


    //Merge two Array
    public static int[] mergeArray(int[] arr,int[] arrs) {
        int[] res = new int[arr.length + arrs.length];
        /*for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        for(int i=arr.length;i<res.length;i++){
            res[i]=arrs[i-arr.length];
        }

    */

        for (int i = 0; i < res.length; i++) {
            if (i < arr.length) {
                res[i] = arr[i];
            } else {
                res[i] = arrs[i - arr.length];
            }
        }

        return res;
    }

    //sum of element all element except number present on index

    public static void sumOfElement(int[] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans +=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=ans-nums[j];
        }

        printArray(nums);

        /*int[] res= new int[nums.length-1];
        for(int i=0;i<res.length;i++){
            int sum=0;
            for(int j=0;j<res.length;j++){
                if(i!=j) {
                    sum += nums[i];
                }
            }
            res[i]=ans;
        }*/
    }

    // Multiply all Element Accept the index position

    public static void mulOfElement(int[] nums){
        int[] res = new int[nums.length];
        int pf  =1;
        for(int i=0;i<nums.length;i++){
            res[i]=pf;
            pf*=nums[i];
        }
        int sf=1;
        for(int i=nums.length-1; i >=0 ;i--){
            res[i]*=sf;
            sf*=nums[i];
        }

        printArray(res);
    }


}

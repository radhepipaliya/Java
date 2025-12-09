package com.qspider.task;

public class RecursionTask {
    public static void main(String[] args){
        System.out.println(recursionFactorial(5));
        System.out.println(recursionFibonacci(10));
        printFactors(10,1);
    }

    public static int recursionFactorial(int n){
           if(n>=1){
               return n*recursionFactorial(n-1);
           }else{
               return 1;
           }

    }

    public static int recursionFibonacci(int n){

        if(n == 0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        return recursionFibonacci(n-1)+recursionFibonacci(n-2);
    }

    public static void printFactors(int n,int i){

        if(i>n){
            return;
        }
        if(n % i == 0){
            System.out.println(i);
        }

        printFactors(n,i+1);

    }
}

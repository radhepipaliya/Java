package com.dsa.basic;

public class SumOfDigit {
    public static void main(String[] args){
        System.out.println(sumOfDigit(254));
        System.out.println(sumOfDigit(2545));
    }

    // Loop
    static int sumOfDigit(int n){
        int sum =0;
        while( n != 0){
            int last = n %10;
            sum+=last;
            n = n/10;
        }

        return sum;
    }

    //Optimised~ recursion

    public static int recursion(int n){
        if(n ==0){
            return 0;
        }

        return recursion(n%10) + recursion(n/10);
    }
}

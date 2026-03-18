package com.dsa.basic;

public class FibonacciSeries {
    public static void main(String[] args){
//        fibonacci(10);

        for(int i =0; i < 10 ; i++){
            System.out.print(fibo(i) + " ");
        }
    }

    // loop
    public static void fibonacci(int n){
        int n1 =0, n2=1;
        for(int i =0;i <n;i++){
            System.out.print(n1+" ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }

    //optimised way ~ Recursive call
    public static int fibo(int n){
        if( n<=1)
            return n;

        return fibo(n-1) + fibo(n-2);
    }
}

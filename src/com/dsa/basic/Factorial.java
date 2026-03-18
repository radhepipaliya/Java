package com.dsa.basic;

public class Factorial {
    public static void main(String[] args){
//            int ans = factorial(5);
        int ans = fac(5);
            System.out.println(ans);
    }

    // loop
    public static int factorial(int n){
        int res = 1 ,i;
        for(i =2; i <=n ; i++){
            res *= i;
        }
        return res;
    }

//optimised~ Recursion
    public static int fac(int n){
        if(n == 0 ){
            return 1;
        }

        return n * fac(n-1);
    }

}

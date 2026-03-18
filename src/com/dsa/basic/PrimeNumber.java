package com.dsa.basic;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(checkPrime(7));
    }

    public static boolean checkPrime(int n){
        for(int i =2;i< n;i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
}

package com.dsa.basic;

public class ReverseNumber {
    public static void main(String[] args){
        int n = 15482;
        System.out.println(rev(n));
    }

    public static int rev(int n){
        int revnum = 0;
        int rem;

        while(n >0){
            rem =n%10;
            revnum =(revnum*10) + rem;
            n = n/10;
        }
        return revnum;
    }
}

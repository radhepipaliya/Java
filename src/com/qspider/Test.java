package com.qspider;

public class Test {
    public static void main(String[] args){
/*
        oddOrEven(10);
*/
        /*greatestOfThree(10,20,30);*/
        /*printSumOfN2(10);*/
        /*printTable(10);*/
        /*System.out.println(isPrime(3));*/
        /*evenBetweenN(100);*/
        printPattern(3);
    }

    public static void oddOrEven(int n){
        if(n%2==0){
            System.out.println("Even");

        }else{
            System.out.println("odd");
        }
    }

    public static void greatestOfThree(int a ,int b, int c){
        if(a>b&&a>c){
            System.out.println(a);
        }
        else if(b>a&&b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }

    public static void printSumOfN(int n){
        int ans =0;
        for(int i=1;i<=n;i++){
            ans += i;
        }
        System.out.println(ans);
    }

    public static void printSumOfN2(int n){
        int ans = n*(n+1)/2;
        System.out.println(ans);
    }

    public static void printTable(int n){
        for(int i =1; i<=10;i++){
            System.out.println(n+" "+"* "+i+"= "+n*i);
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void evenBetweenN(int n){
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
package com.qspider.task;

import java.util.Scanner;

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
        /*printPattern(3);*/
        /*System.out.println(printFactorial(5));*/
        /*System.out.println(printFibonacci(5));*/
        /*System.out.println(isPositive(5));*/
        /*System.out.println(sumOfDigit(153));*/
        /*patternNum(5);*/
        /*calculator(10,50);*/
        checkArmstrong(1000);
        /*System.out.println(power(2,1));*/

    }
//Section-A
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
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static int printFactorial(int n){
        if(n>=1){
            return n*printFactorial(n-1);
        }else{
            return 1;
        }
    }

    public static int printFibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return printFibonacci(n-1)+printFibonacci(n-2);
    }

    public static boolean isPositive(int n){
        return n > 0;
    }

    public static int sumOfDigit(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void patternNum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }


//    Section-B
    public static void calculator(int a, int b){
        System.out.println("Calculator");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Modulo");
        System.out.println("Enter Number to Perform Operation");
        Scanner sc= new Scanner(System.in);
        int f = sc.nextInt();
        switch(f){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
        }
    }

    public static void checkArmstrong(int n){
        for(int i=1;i<=n;i++){
            if(armstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean armstrong(int n){
        int temp = n;
        int sum=0;
        int count=count(n);

        while(n>0){
            int rem=n%10;
            sum+=power(rem,count);
            n/=10;
        }
        return temp==sum;
    }
    public static int count(int n){
        int count=0;
        while (n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static int power(int x,int y){
        int ans =1;
        for(int i=1;i<=y;i++){
            ans *=x;
        }
        return ans;
    }





}
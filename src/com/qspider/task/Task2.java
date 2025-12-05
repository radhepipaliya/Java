package com.qspider.task;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /*System.out.println(square(5));
        System.out.println(cube(5));*/

        /*System.out.println("Enter the Two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(maxFoTwo(a,b));
        System.out.println(minFoTwo(a,b));*/

        /*boolean ans = isEven(2);
        if(ans){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }*/


//        System.out.println(absolute(-7));

        /*System.out.println(simpleInterest(1000,12,5));*/


        /*int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumOfTwo(a,b));*/


//        System.out.println(maxOfThree(50,2,85));

         /*int ans=signOfNumber(0);
         if(ans==1){
             System.out.println("Positive");
         }else if(ans==-1){
             System.out.println("Negative");
         }else{
             System.out.println("Zero");
         }*/

//        System.out.println(factorial(5));

      /*  System.out.println(countDigits(12345));
        System.out.println(sumOfDigits(12345));*/


       /* System.out.println("Enter the Number tho check Prime Number:");
        int num = sc.nextInt();
        System.out.println(isPrime(num));*/

        /*System.out.println(isPalidromeNumber(1551));*/

        /*System.out.println(isArmstrong(154));*/

        /*System.out.println(gcd(12,18));*/

        /*System.out.println(lcm(12,18));*/

        System.out.println(countPrimeNumberInRange(1,100));
    }

    public static int square(int n){
        return n*n;
    }

    public static int cube(int n){
        return n*n*n;
    }

    public static int maxFoTwo(int a,int b){
        if(a<b){
            return b;
        }else {
            return a;
        }
    }

    public static int minFoTwo(int a, int b){
            if(a<b){
              return a;
          }
         return b;
    }

    public static boolean isEven(int n){
            return n%2==0;
    }

    public static int absolute(int n){
            if(n<0){
                return -n;
            }else{
                return n;
            }
    }

    public static double simpleInterest(double p , double r,double t){
        double simInt = (p*r*t/100);
        return simInt;
    }

    public static int sumOfTwo(int a,int b){
        return a+b;
    }

    public static int maxOfThree(int a,int b,int c){
        if(a>=b&&a>=c){
            return a;
        }else if(b>=a&&b>=c){
            return b;
        }else{
            return c;
        }
    }

    public static int signOfNumber(int n){
        if(n<0){
            return -1;
        }
        else if(n==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int factorial(int n){
        int ans =1;
        for(int i=1;i<=n;i++){
            ans *=i;
        }
        return ans;
    }

    public static int countDigits(int n){
       if(n<0){
           n=-n;
       }

        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

    public static int reverseNumber(int n){
        int reverse =0;
        while(n>0){
            int digit =n%10;
            reverse = reverse*10+digit;
            n=n/10;
        }
        return reverse;
    }

    public static  boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalidromeNumber(int n){
        int original =n;
        int reversed =0;

        while(n>0){
            int digit = n%10;
            reversed = reversed *10+digit;
            n=n/10;
        }
        return original==reversed;
    }

    public static boolean isArmstrong(int n){
        int original=n;
        int sum=0;

        while(n>0){
            int digit = n%10;
            sum +=digit*digit*digit;
            n=n/10;
        }
        return sum==original;
    }

    public static int gcd(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);

        int gcd=1;

        int min = (a < b) ? a : b;

        for(int i = 1;i<=min;i++){
            if(a%i==0 &b%i==0){
                gcd = i ;
            }
        }

        return gcd;
    }


    public static int lcm(int a,int b){
        return ((a*b)/gcd(a,b));
    }

    public static int countPrimeNumberInRange(int start,int end){
        int count =0;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
}

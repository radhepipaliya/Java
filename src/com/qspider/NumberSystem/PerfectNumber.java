package com.qspider.NumberSystem;

public class PerfectNumber {
        public static void main(String[] args){
/*
            System.out.println(isPerfect(5));
*/
            /*System.out.println(isStrong(145));*/

            /*System.out.println(isNeon(5));*/
            /*System.out.println(isHappyR(10));*/
            System.out.println(isArmstrong(153));

        }

        public static boolean isPerfect(int n){
            int sum=0;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum +=i;
                }
            }
            return n==sum;

        }

    public static boolean isStrong(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            int modulo=n%10;
            sum +=recursionFactorial(modulo);
            n=n/10;
        }
        return sum==temp;


    }


    public static int recursionFactorial(int n){
        if(n>=1){
            return n*recursionFactorial(n-1);
        }else{
            return 1;
        }

    }

    public static boolean isNeon(int n){
            return n==1 || n==9;
    }

    public static boolean isSunny(int n){
        int temp = n+1;

        for(int i=1;i<=temp/2;i++){
            if(i*i==temp){
                return true;
            }
        }
        return false;
    }

    public static boolean isEvil(int n){
        int sum=0;
        while(n>0){
            sum+=n%2;
            n/=2;
        }
        return sum%2==0;
    }

    public static boolean isHappy(int n){
        while(n>9){
            int sum=0;
            while(n>0){
                sum +=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
        return n==1||n==7;
    }

    public static boolean isHappyR(int n){
            if(n==1){
                return true;
            }
            if(n==4){
                return false;
            }
            int sum=0;
        while(n>0){
            sum +=(n%10)*(n%10);
            n/=10;
        }
        return isHappyR(sum);

    }

    public static boolean isArmstrong(int n){
            int temp = n;
            int sum =0;
            int n1=n;
            int count =digits(n);

            while(n>0){
              int rem = n%10;
                sum +=power(rem,count);
                n /=10;
            }

            return n1==sum;
    }

    public static int digits(int n){
            int sum=0;
            while(n>0){
                n/=10;
                sum +=1;
            }
            return sum;
    }

    public static int power(int x ,int y){
            int pd=1;
            for(int i=0; i<=y;i++){
                pd *=x;
            }
            return pd;
    }

}

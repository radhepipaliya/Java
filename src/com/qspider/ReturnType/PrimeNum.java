package com.qspider.ReturnType;
// to design a method which accepts number from the user and the check the give prime is or not
public class PrimeNum {

    public static void main(String[] args){
        System.out.println(checkPrime(7));
    }

    public static boolean checkPrime(int n){
       /* if(n<=1){
            return false;
        }
        for(int i=2; i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;*/

        int count=0;
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        return count==2;
    }
}

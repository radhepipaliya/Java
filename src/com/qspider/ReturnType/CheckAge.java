package com.qspider.ReturnType;
import java.util.Scanner;

public class CheckAge {

    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(validateAge(age));
    }

    /*public static boolean checkVoteAge(int age){
        if(age>=18){
            return true;
        }else if(age>0 && age<18){
            return false;
        }else{
            System.out.println("Please insert valid input");
        }
        return false;
    }*/

    public static boolean validateAge(int age){
        return age>=18;
    }


}

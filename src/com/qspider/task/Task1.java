package com.qspider.task;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        /*printHello();*/


        /*printLine();
        printName("Radhe Piaplaiya");
        printLine();*/


        /*System.out.println("Enter the Number to Print Table");
        int table=sc.nextInt();
        printTable(table);*/

        /*printEvenNumber(1,10);*/

        /*printOddNumber(1,10);*/

        /*int firstNum=sc.nextInt();
        int secondNum=sc.nextInt();
        printSum(firstNum,secondNum);*/

        /*int marks=sc.nextInt();
        printGrade(marks);*/

        /*int age=sc.nextInt();
        checkVoteAge(age);*/

        /*int n=sc.nextInt();
        printNNumber(n);*/

        /*int n=sc.nextInt();
        printReverse(n);*/

        /*int rows=sc.nextInt();
        printStarPattern(rows);*/

        /*printMenu();*/

        /*int[] arr={1,2,3,4,5};
        printArray(arr);*/

        int n=sc.nextInt();
        printPositiveOrNegative(n);


    }

    public static void printHello(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello Students");
        }
    }

    public static void printLine(){
        System.out.println("===================");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }

    public static void printEvenNumber(int start, int end){
        for(int i = start;i<=end;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void printOddNumber(int start, int end){
        for(int i = start;i<=end;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

    public static void printSum(int a,int b){
        System.out.println(a+b);
    }

    public static void printGrade(int n){
        if(n>=40){
            System.out.println("Pass");
        }else if(n>0&&n<40){
            System.out.println("Fail");
        }else{
            System.out.println("Please put valid input");
        }
    }

    public static void checkVoteAge(int age){
        if(age>=18){
            System.out.println("You are Eligible for Voting..");
        }else if(age>0 && age<18){
            System.out.println("You are not eligible for Voting..");
        }else{
            System.out.println("Please insert valid input");
        }
    }

    public static void printNNumber(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }

    public static void printReverse(int n){
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }

    public static void printStarPattern(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public static void printMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Enter a Choice"+"\n"+
                "1. Add"+"\n"+
                "2. Subtract"+"\n"+
                "3. Multiply"+"\n"+
                "4. Divide"+"\n"
        );

        int choice = sc.nextInt();
        System.out.println(choice);
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void printPositiveOrNegative(int n){
        if(n==0){
            System.out.println("Zero");
        }else if(n<0){
            System.out.println("Negative");
        }else{
            System.out.println("Postive");
        }
    }

}
package com.qspider.day1;

public class CelsiusToFarenheit {
    public static void main(String[] args){
        convert(50.5);
    }
    public static void convert(double a){
        double result=(a+32)*9/5;
        System.out.println(result);
    }
}

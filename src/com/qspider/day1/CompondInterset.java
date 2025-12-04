package com.qspider.day1;

public class CompondInterset {
    public static void main(String[] args){
        calculate(10005.0,12.6,5);
    }
    public static void calculate(double principal,double rate,int time){
        int pd=1;
        double rt = 1+rate/100;
        for(int i=1 ; i<=time; i ++){
            pd*=rt;
        }
        double result=principal*pd;
        double ci=result-principal;
        System.out.println(ci);
    }
}

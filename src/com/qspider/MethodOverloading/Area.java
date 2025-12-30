package com.qspider.MethodOverloading;

public class Area {
    public static void main(String[] args){

    }

    public static int area(int length){
        return length*length;
    }

    public static double area(double length, double height){
        return length*height;
    }

    public static double area(double radius){
        return 3.14*radius*radius;
    }

    public static double area(int length,int breath){
        return 0.5*length*breath;
    }

    public static double area(double radius ,int height){
        double ans = 2*3.14*(radius*radius);
        return ans*height+ans;
    }

    public static double area(double length, double width,double height){
        return 2*((length*width)+(length+height)+(width+height));
    }

}

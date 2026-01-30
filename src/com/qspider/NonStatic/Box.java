package com.qspider.NonStatic;

public class Box {
    int length;
    int breadth;

    public void box(int length, int breath){
        this.length = length;
        this.breadth = breath;
    }

    public int  area(){
        return length*breadth;
    }
}

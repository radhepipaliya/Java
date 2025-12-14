package com.qspider.Pattern;

public class StarPattern {
   public void draw(int n){
        for(int row=1; row<=n;row++){
            for(int col=1; col<=row;col++){
                System.out.print("*"+" ");

            }
            System.out.println();
        }

    }
}

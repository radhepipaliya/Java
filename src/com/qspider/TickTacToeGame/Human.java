package com.qspider.TickTacToeGame;

import java.util.Scanner;

public class Human extends Player{

    public Human(String name, char mark, Board board) {
       super(name,mark,board);
    }

    public void placeMark() {

        Scanner sc = new Scanner(System.in);
        int x=-1 , y=-1;
        do{
            System.out.println(getName()+" place your mark");
            x = sc.nextInt();
            y = sc.nextInt();
        }while (!getBoard().placeMark(x,y,getMark()));
    }

}

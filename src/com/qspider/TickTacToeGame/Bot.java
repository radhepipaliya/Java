package com.qspider.TickTacToeGame;

import java.util.Random;

public class Bot extends Player {

    public Bot(char mark, Board board) {
        super("copilot",mark,board);
    }

    public void placeMark(){
        //In java , Random Class -> it gives/generate random objects
        Random random = new Random();
        int x =-1;
        int y =-1;
        do{
            x= random.nextInt(3);
            y= random.nextInt(3);
        }while (!getBoard().placeMark(x,y,getMark()));
    }
}

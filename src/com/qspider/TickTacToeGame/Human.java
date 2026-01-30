package com.qspider.TickTacToeGame;

import java.util.Scanner;

public class Human {

    // properties
    private String name;
    private char mark;
    private Board board;

    public Human(String name, char mark, Board board) {
        this.name = name;
        this.mark = mark;
        this.board = board;
    }

    public void placeMark() {

        Scanner sc = new Scanner(System.in);
        int x = -1, y = -1;

        do {
            System.out.println(name + " place your mark");
            x = sc.nextInt();
            y = sc.nextInt();

        } while (!board.placeMark(x, y, mark));
    }

    public String getName() {
        return name;
    }
}

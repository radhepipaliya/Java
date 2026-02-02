package com.qspider.TickTacToeGame;

public abstract class Player {
    private String name = "copilot";
    private char mark;
    private Board board;

    public Player(String name, char mark, Board board) {
        this.name = name;
        this.mark = mark;
        this.board = board;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public abstract void placeMark();
}

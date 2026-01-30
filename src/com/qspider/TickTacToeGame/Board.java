package com.qspider.TickTacToeGame;

public class Board {
    private char[][] marking = new char[3][3];

    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                marking[i][j] = ' ';
            }
        }
    }

    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(marking[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }


    public boolean isRowWin() {
        for (int i = 0; i < 3; i++) {
            if (marking[i][0] != ' ' && marking[i][0] == marking[i][1] && marking[i][1] == marking[i][2]) {
                return true;
            }
        }

        return false;
    }

    public boolean isColWin() {
        for (int i = 0; i < 3; i++) {
            if (marking[0][i] != ' ' && marking[0][i] == marking[1][i] && marking[1][i] == marking[2][i]) {
                return true;
            }
        }

        return false;
    }

    public boolean isDigWin() {
        if ((marking[0][0] != ' ' && marking[0][0] == marking[1][1] && marking[1][1] == marking[2][2]) || (marking[0][2] != ' ' && marking[0][2] == marking[1][1] && marking[1][1] == marking[2][0])) {
            return true;
        }
        return false;
    }

    public boolean placeMark(int x, int y, char mark) {
        if (x > 3 || x < 0 || y > 3 || y < 0) {
            return false;
        }

        if (marking[x][y] == ' ') {
            marking[x][y] = mark;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.displayBoard();
        System.out.println(b.isRowWin());
    }
}
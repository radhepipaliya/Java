package com.qspider.TickTacToeGame;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        System.out.println("Welcome to sun chokdi Game");

        Board b = new Board();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Player Name:");
        String name1 = sc.next();

        System.out.println("Enter First Player Mark :");
        char mark1 = sc.next().charAt(0);

        Human h1 = new Human(name1, mark1, b);

        System.out.println("Enter Second player name:");
        String name2 = sc.next();

        char mark2;

        if (mark1 == 'O') {
            mark2 = 'X';
        } else {
            mark2 = 'O';
        }

        Human h2 = new Human(name2, mark2, b);

        b.displayBoard();

        Human h = h1;
        int count = 0;

        while (true) {

            h.placeMark();
            b.displayBoard();

            if (b.isRowWin() || b.isColWin() || b.isDigWin()) {
                System.out.println(h.getName() + " Wins");
                break;
            }

            count++;

            if (count == 9) {
                System.out.println("Game Draw");
                break;
            }

            if (h == h1) {
                h = h2;
            } else {
                h = h1;
            }
        }
    }
}

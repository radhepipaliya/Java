package com.qspider.TickTacToeGame;

import com.qspider.TickTacToeGame.Board;
import com.qspider.TickTacToeGame.Bot;
import com.qspider.TickTacToeGame.Human;
import com.qspider.TickTacToeGame.Player;


import java.util.Scanner;

public class Game {
    public static void twoPlayerGame(){
        Board b = new Board();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Player Name:");
        String name1 = sc.next();
        System.out.println("Enter First Player Mark :");
        char mark1 = sc.next().charAt(0);
        Human h1 = new Human(name1,mark1,b);
        System.out.println("Enter Second player name:");
        String name2 = sc.next();
        char mark2;
        if(mark1=='O'){
            mark2='X';
        }else{
            mark2='O';
        }
        Human h2 = new Human(name2,mark2,b);
        b.displayBoard();
        Human h = h1;
        int count=0;
        while(true) {
            h.placeMark();
            b.displayBoard();
            if (b.isRowWin() ||  b.isColWin() ||  b.isDigWin()) {
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


    public static void singlePlayerGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.next();
        System.out.println("Enter Your Mark");
        char mark = sc.next().charAt(0);
        Board b = new Board();
        Human h = new Human(name,mark,b);
        char mark2 = mark=='O'?'X':'O';
        Bot bt = new Bot(mark2,b);
        b.displayBoard();
        Player p = h;
        int count=0;
        while(true) {
            p.placeMark();
            b.displayBoard();
            if (b.isRowWin() || b.isColWin() || b.isDigWin()) {
                System.out.println(p.getName() + " Wins");
                break;
            }
            count++;
            if (count == 9) {
                System.out.println("Game Draw");
                break;
            }

            if (p == h) {
                p = bt;
            } else {
                p = h;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcoome to sun chokdi Game");
        Scanner sc = new Scanner(System.in);
        int choice=0;
        a:do{
            System.out.println("Press 1 : for Single Player");
            System.out.println("Press 2 : for Two Player");
            System.out.println("Press 3 : for Exit");
            System.out.println("Enter Your Choice :");
            choice= sc.nextInt();
            switch (choice){
                case 1 : singlePlayerGame();
                    break;
                case 2: twoPlayerGame();
                    break;
                case 3:
                    System.out.println("Have a good Day Bye");
                    break a;
                default:
                    System.out.println("You Had Enter wrong Input");
                    System.out.println("Please Try Again");
            }
        }while(true);
    }
}
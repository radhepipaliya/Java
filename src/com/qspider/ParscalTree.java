package com.qspider;

public class ParscalTree {
        public static void main(String[] args) {
            printPascal(5);   // change 5 to how many rows you want
        }


        static void printPascal(int n) {
            for (int row = 0; row < n; row++) {
                for (int s = 0; s < n - row - 1; s++) System.out.print(" ");
                long val = 1;
                for (int col = 0; col <= row; col++) {
                    System.out.print(val + " ");
                    val = val * (row - col) / (col + 1); // next C(row, col)
                }
                System.out.println();
            }
        }
}


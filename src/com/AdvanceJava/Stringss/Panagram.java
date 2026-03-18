package com.AdvanceJava.Stringss;

import java.util.Scanner;

public class Panagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(isPanagram(str));
    }
    private static boolean isPanagram(String str) {
        boolean[] word = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                word[ch - 97] = true;
            }
        }

        for(int i = 0; i< 26 ; i++){
            if(!word[i]){
                return false;
            }

        }

        return true;
    }
}
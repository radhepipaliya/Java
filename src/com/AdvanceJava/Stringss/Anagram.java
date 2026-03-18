package com.AdvanceJava.Stringss;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();
        System.out.println(isAnagram(s,s1));
    }

    public static boolean isAnagram(String s, String s1){
        if(s.length()!=s1.length()){
            return false;
        }

        char[] str1 = s.toCharArray();
        char[] str2 = s1.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0;i<str1.length;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
        }

        return true;
    }

}

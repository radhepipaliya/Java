package com.Collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {
    static HashMap<String,String> dictionary = new HashMap<>();
    public static void main(String[] args){

        dictionary.put("apple","It is a fruit.");
        dictionary.put("Banana","It is a fruit!!");
        dictionary.put("Computer","It stands for Common Operating Mahine Purposely used for Technological Education Research ");

        Scanner sc = new Scanner(System.in);
        String data = sc.next();

        System.out.println((dictionary.get(data) ==null)?"Word is not in the Dictionary":dictionary.get(data));


    }

    public static String suggestions(String word){
        Set<String> key = dictionary.keySet();
        return word;
    }
}

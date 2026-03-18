package com.AdvanceJava.Stringss;

import java.util.Scanner;

public class ReverseWords {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();

       String[] words = s.split(" ");
       String res = "";

//       for(int i=words.length-1;i>=0;i--){
//           res +=words[i]+" ";
//       }

       for(int i =0; i< words.length;i++){
           for(int j=words[i].length()-1;j>=0;j--){
               res += words[i].charAt(j);
           }
           res +=" ";
       }
       System.out.println(res);
   }
}

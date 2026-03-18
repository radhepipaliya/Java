package com.AdvanceJava.Stringss;

import java.util.Scanner;

public class LongestSubStringPalidrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(LongestPalidrome(s));
    }

    public static int LongestPalidrome(String s){
        int max =1;
        int left =1;
        int right =1;
        for(int i = 1; i<=s.length()-1;i++){
            int l=i-1;
            int r=i+1;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)==s.charAt(r)){
                    int len = r-l+1;
                    if(len>max)
                        max=len;
                        left = l;
                        right = r;

                    l--;
                    r++;
                }else{
                    break;
                }
            }
            System.out.println(s.substring(left,right));
        }

        for(int i = 1; i<=s.length()-1;i++){
            int l=i;
            int r=i+1;
            while(l>=0 && r<s.length()){
                if(s.charAt(l)==s.charAt(r)){
                    int len = r-l+1;
                    if(len>max)
                        max=len;
                    l--;
                    r++;
                }else{
                    break;
                }
            }
        }
        System.out.println(s.substring(left ,right));
        return max;
    }


}

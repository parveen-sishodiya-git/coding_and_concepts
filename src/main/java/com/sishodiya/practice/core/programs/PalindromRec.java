package main.java.com.sishodiya.practice.core.programs;

import java.util.Scanner;

public class PalindromRec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        // System.out.println(str);
        System.out.println("String Palindrome "+isStringPalindrome(str));
    }

    public static boolean isStringPalindrome(String str){
        String reverseStr = getReverseWord(str);
        if(reverseStr.equals(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
            return false;
        }
        return true;
    }

    public static String getReverseWord(String str){
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length()-1) + getReverseWord(str.substring(0, str.length()-1));
    }
}

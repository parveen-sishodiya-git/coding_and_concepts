package main.java.com.sishodiya.practice.core.programs;// package dpackage;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "madamd";
        int left = 0;
        int right = str.length() - 1;
        boolean result = true;
        while (left < right) {
            if(str.charAt(left)!=str.charAt(right)){
                result = false;
                break;
            }   
            left++;right--;         
        }
        if (result) {
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}

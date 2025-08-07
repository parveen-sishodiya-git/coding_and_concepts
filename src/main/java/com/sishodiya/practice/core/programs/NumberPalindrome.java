package main.java.com.sishodiya.practice.core.programs;// package dpackage;

import java.util.Scanner;

public class NumberPalindrome {
   public static void main(String[] args) {
    System.out.println("Enter a number");
    int number = new Scanner(System.in).nextInt();
    int numberCopy = number;
    int finalNumber = 0;
    while (numberCopy > 0) {
        int digit = numberCopy % 10;
        finalNumber = (finalNumber * 10) + digit;
        numberCopy /= 10;
    }
    if (finalNumber==number) {
        System.out.println("Number is palindrome");
    }else{
        System.out.println("Number is not palindrome");
    }
   } 
}

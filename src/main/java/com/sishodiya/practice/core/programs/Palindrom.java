package main.java.com.sishodiya.practice.core.programs;// package main_package;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        // System.out.println("Enter number or string to check palidrome");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number or a string: ");
        String input = scanner.nextLine();  // Read input as string

        // Try to parse input as a number
        try {
            int number = Integer.parseInt(input);
            checkPalindrome(number);
            // System.out.println("You entered a number: " + number);
        } catch (NumberFormatException e) {
            // System.out.println("You entered a string: " + input);
            checkPalindrome(input);
        }
    }

    public static void checkPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[right] = chars[left];
            chars[left] = chars[right];
            left++;
            right--;
        }
        String reverseString = String.valueOf(chars);
        String result = (reverseString.equals(str)) ? "Palindrome" : "Not Palindrome";
        System.out.println(result);
    }
    public static void checkPalindrome(int number){
        checkPalindrome(String.valueOf(number));
    }
}

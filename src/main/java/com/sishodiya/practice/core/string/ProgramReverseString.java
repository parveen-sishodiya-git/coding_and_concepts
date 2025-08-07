package main.java.com.sishodiya.practice.core.string;

// package main_package;
// Write a Java Program to reverse a string without using String inbuilt
public class ProgramReverseString {
    public static void main(String[] args) {
        String str = "apple";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while (left  < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String reverseStr = String.valueOf(chars);
        System.out.println("IN - "+str);
        System.out.println("Out - "+reverseStr);
    }
}

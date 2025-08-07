package main.java.com.sishodiya.practice.core.programs;// package dpackage;

public class NumberInString {
    public static void main(String[] args) {
        String str = "123";
        int left = 0;
        int right = str.length() - 1;
        int numcount = 0;
        while (left <= right) {
            char leftchar = str.charAt(left);
            char rightchar = str.charAt(right);
            if(leftchar >='0' && leftchar <= '9') numcount++;    
            if(rightchar >='0' && rightchar <= '9') numcount++;    
            left++;
            right--;
        }
        System.out.println("Number of numbers in string is "+numcount);
    }
}

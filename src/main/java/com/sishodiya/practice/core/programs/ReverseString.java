package main.java.com.sishodiya.practice.core.programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        // String s1;
        // String s2;
        while (n > 0) {
            String str = new Scanner(System.in).nextLine();
            int left = 0;
            int right = str.length() - 1;
            char[] arr = str.toCharArray();
            while (left < right) {
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
            System.out.println(String.valueOf(arr));
            n--;
        }
    }
}

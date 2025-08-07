package main.java.com.sishodiya.practice.core.programs;//package dpackage;

import java.util.Scanner;

public class OccuranceOfCharacter {
    public static void main(String[] args) {
        String str = "afnkjdsahfjerenrnasuhfindsanfkjads";
        int count=0;
        char target = new Scanner(System.in).next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}

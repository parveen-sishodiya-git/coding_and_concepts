package main.java.com.sishodiya.practice.core.programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter number ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 10)
            System.out.println("Not eligible");
        else {
            int copyNumber = number;
            int numberLength = String.valueOf(number).length();
            int armnumber = 0;
            while (copyNumber > 0) {
                int digit = copyNumber % 10;
                System.out.println("digit = "+digit);
                armnumber = armnumber + (int) Math.pow(digit, numberLength);
                copyNumber = copyNumber / 10;
            }
            if (number == armnumber)
                System.out.println("armstrong");
            else
                System.out.println("not armstrong");
        }
    }
}

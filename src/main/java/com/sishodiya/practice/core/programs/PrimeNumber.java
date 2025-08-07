package main.java.com.sishodiya.practice.core.programs;// package main_package;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime.");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String result = (checkPrimeNumber(number)) ? "Number is prime" : "Number is not prime";
        System.out.println(result);
    }

    public static boolean checkPrimeNumber(int number){
        boolean isPrime = true;
        if (number == 0 || number == 1) return false;
        if (number == 2 || number == 3) return true;
        int limit = (int) Math.sqrt(number);
        for (int i =2; i < limit; i++) {
            if (number%i==0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}

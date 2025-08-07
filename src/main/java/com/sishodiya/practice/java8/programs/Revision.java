package main.java.com.sishodiya.practice.java8.programs;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Revision {
    public static void main(String[] args) {
        findFactorial();
    }
    public static void findFactorial(){
        System.out.println("Enter number to find factorial...");
        int result = IntStream.rangeClosed(2,new Scanner(System.in).nextInt()).reduce(1,(a,b)->a*b);
        System.out.println(result);
    }
}

package main.java.com.sishodiya.practice.java8.programs;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, new Scanner(System.in).nextInt()).reduce(1, (a,b)->a*b));
    }
}

package main.java.com.sishodiya.practice.java8.programs;// package java8styled;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, new Scanner(System.in).nextInt()).reduce(0, (a,b)->a+b));
    }
}

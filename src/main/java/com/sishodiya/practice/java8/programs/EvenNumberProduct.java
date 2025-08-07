package main.java.com.sishodiya.practice.java8.programs;// package java8styled;

import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenNumberProduct {
    public static void main(String[] args) {
//        int i = IntStream.rangeClosed(2, new Scanner(System.in).nextInt()).filter(a -> a%2 == 0).reduce(0, (a,b)->a+b);
//        System.out.println(i);
        testMethod();
    }

    public static void testMethod(){
        System.out.println("Sum of all even number is "+IntStream.rangeClosed(1,10).filter(n->n%2==0).reduce(0,EvenNumberProduct::mySum));
    }

    public static int mySum(int a,int b){
        return a+b;
    }
}

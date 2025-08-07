package main.java.com.sishodiya.practice.java8.concepts;

public class ImplementFI{
    public static void main(String[] args) {
        CustomFunctionalInterface add = (int a, int b) -> a+b;
        CustomFunctionalInterface multiple = (int a, int b) -> a*b;
        int result1 = add.add(4,5);
        int result2 = multiple.add(4, 5);
        System.out.println("Result1 is "+result1);
        System.out.println("Result2 is "+result2);
    }    
}

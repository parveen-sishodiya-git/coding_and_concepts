package main.java.com.sishodiya.practice.core.statics;

public class NumbersInJava {
    public static void main(String[] args) {
        //Method to show the number ranges
        showNumberRanges();
    }

    static void showNumberRanges(){
        System.out.println("Short MIN -> "+Short.MIN_VALUE+" MAX -> "+Short.MAX_VALUE);
        System.out.println("Integer MIN -> "+Integer.MIN_VALUE+" MAX -> "+Integer.MAX_VALUE);
        System.out.println("Long MIN -> "+Long.MIN_VALUE+" MAX -> "+Long.MAX_VALUE);
        System.out.println("Float MIN -> "+Float.MIN_VALUE+" MAX -> "+Float.MAX_VALUE);
        System.out.println("Double MIN -> "+Double.MIN_VALUE+" MAX -> "+Double.MAX_VALUE);
    }
}

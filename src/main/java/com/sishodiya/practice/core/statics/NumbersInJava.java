package main.java.com.sishodiya.practice.core.statics;

import java.math.BigDecimal;

public class NumbersInJava {
    public static void main(String[] args) {
        //Method to show the number ranges
        showNumberRanges();

        //Test numbers
        testNumbers();
    }

    //note
//    🧪 Common Operations with BigDecimal
//    Operation	Example
//    Addition	amount1.add(amount2)
//    Subtraction	amount1.subtract(amount2)
//    Multiplication	amount1.multiply(new BigDecimal("0.18"))
//    Division	amount1.divide(amount2, 2, RoundingMode.HALF_UP)

    static void testNumbers(){
//        System.out.println(0.1 + 0.2);
        BigDecimal b1 = new BigDecimal(0.1);
        BigDecimal b2 = new BigDecimal(0.2);
        BigDecimal result = b1.add(b2);
//        System.out.println(result);
//        System.out.println(10.2 + 5.75);
        BigDecimal amount1 = new BigDecimal("0.1");
        BigDecimal amount2 = new BigDecimal("0.2");
        BigDecimal result1 = amount1.add(amount2);
        System.out.println("Total: " + result1); // Output: 16.00
    }



    static void showNumberRanges(){
        System.out.println("Short MIN -> "+Short.MIN_VALUE+" MAX -> "+Short.MAX_VALUE);
        System.out.println("Integer MIN -> "+Integer.MIN_VALUE+" MAX -> "+Integer.MAX_VALUE);
        System.out.println("Long MIN -> "+Long.MIN_VALUE+" MAX -> "+Long.MAX_VALUE);
        System.out.println("Float MIN -> "+Float.MIN_VALUE+" MAX -> "+Float.MAX_VALUE);
        System.out.println("Double MIN -> "+Double.MIN_VALUE+" MAX -> "+Double.MAX_VALUE);
    }
}

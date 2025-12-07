package main.java.com.sishodiya.practice.core.statics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class NumbersInJava {
    public static void main(String[] args) {
        //Method to show the number ranges
//        showNumberRanges();

        //Test numbers
        testNumbers();

        //sum big decimals
//        sumBigDecimals();

    }

    static BigDecimal getBigDecimal(String str){
        return new BigDecimal(str);
    }

    static void sumBigDecimals(){
        //[1000.50, 2500.75, 325.25]
        List<BigDecimal> balances = Arrays.asList(getBigDecimal("1000.50"),getBigDecimal("2500.75"),getBigDecimal("325.25"));

        BigDecimal finalResult =  balances.stream().reduce(BigDecimal::add).get();
        System.out.println("Final Result = "+ finalResult);
    }

    //note
//    🧪 Common Operations with BigDecimal
//    Operation	Example
//    Addition	amount1.add(amount2)
//    Subtraction	amount1.subtract(amount2)
//    Multiplication	amount1.multiply(new BigDecimal("0.18"))
//    Division	amount1.divide(amount2, 2, RoundingMode.HALF_UP)

    static void testNumbers(){
        BigDecimal inr = new BigDecimal("15000");
        BigDecimal rate = new BigDecimal("87.45");
        BigDecimal usd = inr.divide(rate, 2, RoundingMode.HALF_UP);
        System.out.println(usd);
    }



    static void showNumberRanges(){
        System.out.println("Short MIN -> "+Short.MIN_VALUE+" MAX -> "+Short.MAX_VALUE);
        System.out.println("Integer MIN -> "+Integer.MIN_VALUE+" MAX -> "+Integer.MAX_VALUE);
        System.out.println("Long MIN -> "+Long.MIN_VALUE+" MAX -> "+Long.MAX_VALUE);
        System.out.println("Float MIN -> "+Float.MIN_VALUE+" MAX -> "+Float.MAX_VALUE);
        System.out.println("Double MIN -> "+Double.MIN_VALUE+" MAX -> "+Double.MAX_VALUE);
    }
}

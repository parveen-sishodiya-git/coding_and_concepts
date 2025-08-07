package main.java.com.sishodiya.practice.java8.concepts;

import main.java.com.sishodiya.practice.java8.concepts.MyFunctionalInterface;

public class MyFunctionalInterfaceImpl{
    
    public static void main(String[] args) {
        MyFunctionalInterface myinterface = (a, b) -> a + b;
        int result = myinterface.absMethod(2, 3);
        System.out.println("Result is "+result);
        myinterface.check();
        System.out.println(MyFunctionalInterface.randomInt());
    }

}

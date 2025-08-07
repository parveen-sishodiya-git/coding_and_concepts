package main.java.com.sishodiya.practice.java8.concepts;

@FunctionalInterface
public interface MyFunctionalInterface {

    //abstract method
    int absMethod(int a, int b);

    //default method (optional)
    default void check(){
        System.out.println("Yes i am the default method");
    }
    
    //static method (optional)
    static double randomInt(){
        return Math.random();
    }
}

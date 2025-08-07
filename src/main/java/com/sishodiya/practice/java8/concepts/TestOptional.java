package main.java.com.sishodiya.practice.java8.concepts;

// package java8;
public class TestOptional {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Amit");
        String name = user.getName().orElse("Name not provided");
        System.out.println(name);

    }
}

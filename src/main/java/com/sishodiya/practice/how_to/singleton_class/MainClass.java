package main.java.com.sishodiya.practice.how_to.singleton_class;//package singleton_class;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Updated test");
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        boolean[] b = new boolean[0];
    }
}

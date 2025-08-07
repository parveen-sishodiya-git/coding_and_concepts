
package main.java.com.sishodiya.practice.java8.concepts;
import java.util.Optional;

public class Test {
    public void print(Object obj) {
        System.out.println("Object version");
    }

    public void print(String str) {
        System.out.println("String version");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.print(new String("test1"));
        t.print("test");
        Optional<String> tst = Optional.empty();
    }
}

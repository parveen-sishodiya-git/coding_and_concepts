package main.java.com.sishodiya.practice.core.programs;
public class FactorialRec{
    public static void main(String[] args) {
        int result = calculate(5);
        System.out.println(result);
    }

    public static int calculate(int num){
        if (num == 1) {
            return 1;
        }
        return num * calculate(num-1);
    }
}

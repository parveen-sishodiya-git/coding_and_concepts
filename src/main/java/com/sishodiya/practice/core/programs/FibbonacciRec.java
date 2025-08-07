package main.java.com.sishodiya.practice.core.programs;
public class FibbonacciRec {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        addTwoNum(n1, n2);
    }

    static int n = 0;

    public static int addTwoNum(int n1, int n2) {
        if (n == 10) {
            return n1 + n2;
        }
        // System.out.println(n1);
        // System.out.println(n2);
        int c = n1 + n2;
        System.out.print(c+", ");
        n++;
        return addTwoNum(n2, c);
    }
}

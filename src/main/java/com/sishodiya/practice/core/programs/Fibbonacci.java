package main.java.com.sishodiya.practice.core.programs;

public class Fibbonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        addTwoNum(n1, n2);
    }

    static int n = 0;
    private static int addTwoNum(int a,int b){
        if (n==10) {
            return a+b;
        }
        // System.out.println(a);
        // System.out.println(b);
        int c = a + b;
        System.out.println(c);
        n++;
        return addTwoNum(b,c);
    }
}



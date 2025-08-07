package main.java.com.sishodiya.practice.core.programs;

public class OccuranceChar {
    public static void main(String[] args) {
        String str = "bdsjfhjbbhasuie";
        char target = 'b';
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                counter++;
            }
        }
        System.out.println("Counter = "+counter);
    }
}

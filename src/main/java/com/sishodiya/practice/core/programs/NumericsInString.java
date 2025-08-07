package main.java.com.sishodiya.practice.core.programs;

public class NumericsInString {
    public static void main(String[] args) {
        String str = "abcd123dfgds5";
        int numerics = 0;
        int stringLength = str.length();
        for (int i = 0; i < stringLength; i++) {
            int code =  (int) str.charAt(i);
            if (code >= 48 && code <= 57) {
                numerics++;
            }
        }
        // int r = (int) String.valueOf("6");
        System.out.println("Numbers are "+numerics);
    }
}

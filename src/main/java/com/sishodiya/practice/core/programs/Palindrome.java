package main.java.com.sishodiya.practice.core.programs;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam1";
        int strlen = str.length();
        StringBuilder newString = new StringBuilder();
        for (int i = strlen - 1 ; i >= 0; i--) {
            newString.append(str.charAt(i));
        }
        System.out.println("String 1 "+str);
        System.out.println("String 2 "+newString);
        System.out.println(newString.equals(str));
        if (newString.toString().equals(str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }    
}

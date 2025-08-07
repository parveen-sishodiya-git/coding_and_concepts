package main.java.com.sishodiya.practice.core.programs;// package dpackage;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        String str = "fjgljdsqlkjgklsjdfklgjlsdfkj";

        for (int i = 0; i <= str.length() - 1; i++) {
            boolean isunique = true;
            // System.out.println("checking : "+str.charAt(i)+" @ "+i);
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i)==str.charAt(j)) {
                    // System.out.println("Repeated "+str.charAt(j)+" at index "+j);
                    isunique = false;
                }
            }
            if (isunique) {
                System.out.println(str.charAt(i));
            }
        }
    }
}

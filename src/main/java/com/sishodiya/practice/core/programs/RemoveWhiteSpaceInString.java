package main.java.com.sishodiya.practice.core.programs;

//without replace
public class RemoveWhiteSpaceInString {
    public static void main(String[] args) {
        String str = " i am    soft  war       e ja va develope r   ";
        // System.out.println(str.trim());
        char[] chars = str.toCharArray();
        StringBuilder finalString = new StringBuilder();
        // char[] finalChars = new char[];
        for(char ch:chars){
            if (ch != ' ') {
               finalString.append(ch); 
            }
        }
        System.out.println(finalString.toString());
    }
}

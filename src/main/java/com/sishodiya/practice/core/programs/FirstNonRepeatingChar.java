package main.java.com.sishodiya.practice.core.programs;
import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="swiwssi";
        Character ch = getFirstNonRepeatingCharater(str);
        if(ch != ' '){
            System.out.println("First Non repating charater is "+ch);
        }else{
            System.out.println("In this array all character are repeating");
        }
    }

    public static Character getFirstNonRepeatingCharater(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }

        for(char ch : map.keySet()){
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return ' ';
    }
}

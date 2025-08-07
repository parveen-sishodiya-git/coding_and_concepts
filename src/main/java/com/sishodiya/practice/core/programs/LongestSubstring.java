package main.java.com.sishodiya.practice.core.programs;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        // String str = "abcabcbb";
        String str = "abcdee";
        int result = extractSubstring(str);
        // int result = lengthOfLongestSubstring(str);
        System.out.println("max length of substring is " + result);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0, maxLen = 0;

        HashSet<Character> seen = new HashSet<>();

        while (right < n) {
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }

    public static int extractSubstring(String str) {
        //praveen
        int length = str.length();  //7
        int left = 0;
        int right = 0;
        int maxlength = 0;

        HashSet<Character> seen = new HashSet<>();

        while (right < length) {
            if (!seen.contains(str.charAt(right))) {
                seen.add(str.charAt(right));
                right++;
                maxlength = Math.max(maxlength, right - left);
            } else {
                seen.remove(str.charAt(left));
                left++;
            }
        }

        return maxlength;
    }
}

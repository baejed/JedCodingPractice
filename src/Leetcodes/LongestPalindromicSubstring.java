package Leetcodes;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        System.out.println(longestPalindrome("ksdksddasdw"));

    }

    public static String longestPalindrome(String s) {

        List<String> palindromes = new ArrayList<>();
        String longestPalindrome = "" + s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String currentSubstring = s.substring(i, j);

                if(currentSubstring.length() < longestPalindrome.length())
                    continue;

                if (check(currentSubstring))
                    longestPalindrome = (currentSubstring.length() > longestPalindrome.length())
                            ? currentSubstring
                            : longestPalindrome;
            }
        }

        return longestPalindrome;

    }

    public static boolean check(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

}

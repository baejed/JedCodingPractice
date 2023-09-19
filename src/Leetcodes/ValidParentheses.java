package Leetcodes;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(isValid("[([]])"));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        List<Character> parentheses = new ArrayList<>();
        List<Character> openParentheses = new ArrayList<>();

        openParentheses.add(')');
        openParentheses.add('}');
        openParentheses.add('}');

        for (int i = 0; i < s.length(); i++) {
            parentheses.add(s.charAt(i));
        }

        while (!parentheses.isEmpty()) {
            if (openParentheses.contains(parentheses.get(0)))
                return false;

            for (int i = parentheses.size() - 1; i > 0; i--) {

                if ((parentheses.get(0) == '(' && parentheses.get(i) == ')') && i % 2 != 0) {
                    parentheses.remove(i);
                    parentheses.remove(0);
                    i = parentheses.size();
                    continue;
                }

                if ((parentheses.get(0) == '[' && parentheses.get(i) == ']') && i % 2 != 0) {
                    parentheses.remove(i);
                    parentheses.remove(0);
                    i = parentheses.size();
                    continue;
                }

                if ((parentheses.get(0) == '{' && parentheses.get(i) == '}') && i % 2 != 0) {
                    parentheses.remove(i);
                    parentheses.remove(0);
                    i = parentheses.size();
                    continue;
                }

                if (i == 1)
                    return false;
            }
        }

        return true;
    }

}

package Leetcodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(isValid("{(({[})[])}"));
        Stack<String> stack = new Stack<>();
    }

    public static boolean isValid(String s) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        if(s.length()%2 != 0) return false;

        for (int i = 0; i < s.length(); i++) {
            stack1.push(s.charAt(i));
        }

        int lastSize = stack1.size();
        int currentSize = stack1.size();

        while (true) {

            if (stack2.isEmpty()) stack2.push(stack1.pop());

            if (
                    (stack1.peek() == '(' && stack2.peek() == ')') ||
                    (stack1.peek() == '{' && stack2.peek() == '}') ||
                    (stack1.peek() == '[' && stack2.peek() == ']')
            ){
                stack1.pop();
                stack2.pop();
            }else{
                stack2.push(stack1.pop());
            }

            if(stack1.isEmpty()){
                while(!stack2.isEmpty()){
                    stack1.push(stack2.pop());
                }
                currentSize = stack1.size();
                if(lastSize == currentSize) break;
                lastSize = currentSize;
            }

            if(stack1.isEmpty() && stack2.isEmpty()) return true;

        }

        return false;


    }

}

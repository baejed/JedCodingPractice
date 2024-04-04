package Leetcodes;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<String> mainStack = new Stack<>();
        Stack<String> secStack = new Stack<>();

        for (int i = tokens.length - 1; i >= 0; i--) {
            mainStack.push(tokens[i]);
        }

        while (mainStack.size() != 1) {

            while (!mainStack.isEmpty()) {
                if (
                        mainStack.peek().equals("+") ||
                                mainStack.peek().equals("-") ||
                                mainStack.peek().equals("*") ||
                                mainStack.peek().equals("/")
                ) {
                    break;
                } else {
                    secStack.push(mainStack.pop());
                }
            }

            String operation = mainStack.pop();
            int num2 = Integer.parseInt(secStack.pop());
            int num1 = Integer.parseInt(secStack.pop());
            int result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
            }

            mainStack.push("" + result);

            while (!secStack.isEmpty()) {
                mainStack.push(secStack.pop());
            }
        }

        return Integer.parseInt(mainStack.pop());

    }

}

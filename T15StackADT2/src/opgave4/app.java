package opgave4;

import java.util.Stack;

public class app {
    public static void main(String[] args) {
        // Example usage
        String postfixExpression = "12 2 5 + - 4 * 2 /";
        int result = evaluate(postfixExpression);
        System.out.println("Result: " + result);
    }

    public static int evaluate(String input) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = input.split("\\s+");


        for (String token : tokens) {
            if (isNumeric(token)) {
                // If the token is a number, push it onto the stack
                stack.push(Integer.parseInt(token));
            } else {
                // If the token is an operator, pop operands from the stack, perform the operation, and push the result back
                if (stack.size() < 2) {
                    throw new RuntimeException("Invalid postfix expression: Not enough operands for operator " + token);
                }

                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        if (operand2 == 0) {
                            throw new RuntimeException("Invalid postfix expression: Division by zero");
                        }
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new RuntimeException("Invalid postfix expression: Unknown operator " + token);
                }
            }
        }

        // The final result should be the only element left in the stack
        if (stack.size() != 1) {
            throw new RuntimeException("Invalid postfix expression: Too many operands");
        }

        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

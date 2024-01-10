package opgave2;

import java.util.Stack;

public class ChatGPTsaysthisworks {
    public static boolean isMatching(String input) {
        Stack<Character> stack = new Stack<>();
        char[] brackets = {')', '}', ']'};

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !matches(stack.pop(), c, brackets)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean matches(char open, char close, char[] brackets) {
        for (int i = 0; i < brackets.length; i++) {
            if (close == brackets[i] && open != brackets[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String correctString = "(3+{5[99 {*}]}[23[{67}67]])";
        String incorrectString = "(}){";

        System.out.println(isMatching(correctString));  // Output: true
        System.out.println(isMatching(incorrectString)); // Output: false
    }
}

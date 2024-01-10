package opgave3;

import java.util.Stack;

public class main {
    private static Stack<Character> charStack = new Stack<>();
    public static void main(String[] args) {

        System.out.println(isPalindrome("ABCDEFGFEDCBA"));

    }

    public static boolean isPalindrome(String s){
        Stack<Character> reversedStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            charStack.push(s.charAt(i));
        }
        for(int i = s.length()-1; i >= 0; i--){
            reversedStack.push(s.charAt(i));
        }
        for(int i = 0; i < charStack.size(); i++){
            if(!charStack.pop().equals(reversedStack.pop())){
                return false;
            }
        }
        return true;
    }
}

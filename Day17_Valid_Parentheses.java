// Problem statement
// You're given a string 'S' consisting of "{", "}", "(", ")", "[" and "]" .



// Return true if the given string 'S' is balanced, else return false.

import java.util.Stack;

public class Day17_Valid_Parentheses {

  public static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValidParenthesis("{[]}")); // true
    }
}
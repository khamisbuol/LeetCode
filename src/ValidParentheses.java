import java.util.Stack;

/**
 * Problem number: 20
 * Link: https://leetcode.com/problems/valid-parentheses/description/
 *
 * Author: Khamis Buol
 * Year:   2023
 *
 */

public class ValidParantheses {

    ValidParantheses(){}

    public static void main(String[] args) {
        ValidParantheses validParantheses = new ValidParantheses();
        System.out.println(validParantheses.isValid("([)]"));
        
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // Pushing opening bracket to stack
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            // Removing matching closing brackets
            else if (c == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if (c == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else if (c == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.empty();
    }
}

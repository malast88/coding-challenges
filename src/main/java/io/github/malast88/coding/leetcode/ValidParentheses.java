package io.github.malast88.coding.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    /**
     * Solution for Leetcode problem "Two Sum" https://leetcode.com/problems/valid-parentheses/ .
     *
     * @param s string which contains only opening and closing parentheses, brackets or curly bracess
     * @return true if {@param s} has the correct character order, false otherwise.
     */
    /*
    # Solution
    Use a Stack.
    Iterate over a string, each opening parenthesis character push to the stack.
    If the current character is closing parenthesis, check if stack is not empty and the top of the stack contains the
    corresponding opening character, otherwise return false.
    If after iterating the string stack is not empty, than the order is wrong.

    _Complexity - O(n)_

    _Space - O(n)_
     */
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i=0;i<s.length();i++) {
            if (isOpening(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty() || !isCorrectClosing(stack.pop(), s.charAt(i))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpening(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isCorrectClosing(char op, char cl) {
        return op == '(' && cl == ')' ||
                op == '[' && cl == ']' ||
                op == '{' && cl == '}';
    }
}

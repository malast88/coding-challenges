package io.github.malast88.coding.leetcode;

public class RomanToInteger {
    /**
     * Solution for Leetcode problem "Roman To Integer" https://leetcode.com/problems/roman-to-integer/ .
     *
     * @param s String representation of the Roman number
     * @return integer value of the Roman number {@param s}
     */
    /*
    # Solution
    Start accumulating the result from 0.
    Iterate over the string, saving the value of the previous Roman digit (start from previous value 0).
    On each iteration add the value of the current Roman digit to the accumulator.
    If current value is greater than previous, than:
    1. Decrease accumulator by subtracting previous value added on the previous iteration;
    2. Correct the full current value added on the current iteration so subtract the previous value again;

    _Complexity - O(n)_

    _Space - O(1)_
     */
    public int romanToInt(String s) {
        int res = 0;
        int prev = 0;
        for (int i=0; i<s.length(); i++) {
            int curr = charToInt(s.charAt(i));
            res += curr;
            if (curr > prev) {
                res -= 2*prev;
            }
            prev = curr;
        }
        return res;
    }

    private int charToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}

package io.github.malast88.coding.leetcode;

public class PalindromeNumber {
    /**
     * Solution for Leetcode problem "Palindrome Number" https://leetcode.com/problems/palindrome-number .
     *
     * @param x integer to check if it is a palindrome
     * @return true if {@param x} is palindrome, false otherwise
     */
    /*
    # Solution
    If the number is negative it is not a palindrome. Otherwise, reverse the number and compare with itself.

    ## Reversing the number
    Start from 0 result.
    Divide the input number by 10 until its 0.
    Each time multiply result by 10, check for overflow.
    In case no overflow, add the current modulus of input by 10.

    ## Overflow check
    There is overflow after multiplication of the number by 10, if the result of the multiplication, divided by 10,
    does not equal to this number.

    _Complexity - O(1)_

    _Space - O(1)_
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return x == reverse(x);
    }

    private int reverse(int x) {
        int res = 0;
        while (x > 0) {
            int newRes = res * 10;
            if (newRes / 10 != res) {
                return 0;
            }
            res = newRes + x % 10;
            x /= 10;
        }
        return res;
    }
}

package io.github.malast88.coding.leetcode;

public class ValidPalindrome {
  /**
   * Solution for Leetcode problem "Valid Palindrome"
   * https://leetcode.com/problems/valid-palindrome/ .
   *
   * @param s String to check if is a valid palindrome
   * @return true if {@param s} is a valid palindrome
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(1)
   */
  public boolean isPalindrome(String s) {
    int i = nextAlphanumericAt(s, 0);
    int j = prevAlphanumericAt(s, s.length() - 1);
    while (i < j) {
      if (!equalsIgnoreCase(s.charAt(i), s.charAt(j))) {
        return false;
      }
      i = nextAlphanumericAt(s, i + 1);
      j = prevAlphanumericAt(s, j - 1);
    }
    return true;
  }

  private boolean equalsIgnoreCase(char a, char b) {
    return Character.toLowerCase(a) == Character.toLowerCase(b);
  }

  private int nextAlphanumericAt(String s, int i) {
    while (i < s.length() && !Character.isLetterOrDigit(s.charAt(i))) {
      i++;
    }
    return i;
  }

  private int prevAlphanumericAt(String s, int i) {
    while (i >= 0 && !Character.isLetterOrDigit(s.charAt(i))) {
      i--;
    }
    return i;
  }
}

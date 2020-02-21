package io.github.malast88.coding.leetcode;

public class LengthOfLastWord {
  /**
   * Solution for Leetcode problem "Length of Last Word"
   * https://leetcode.com/problems/length-of-last-word/ .
   *
   * @param s Input string
   * @return Length of the last word in {@param s}
   */
  /*
   * # Solution
   * Iterate the string from the end.
   *
   * _Complexity - O(n)
   *
   * _Space - O(1)_
   */
  public int lengthOfLastWord(String s) {
    int i = s.length() - 1;
    while (i >= 0 && s.charAt(i) == ' ') {
      i--;
    }
    int lastChar = i;
    while (i >= 0 && s.charAt(i) != ' ') {
      i--;
    }
    return lastChar - i;
  }
}

package io.github.malast88.coding.leetcode;

public class PlusOne {
  /**
   * Solution for Leetcode problem "Plus One" https://leetcode.com/problems/plus-one/ .
   *
   * @param digits input array, contains digits of a number
   * @return digits of a number which is an increment of {@param digits} by one
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(n)_
   */
  public int[] plusOne(int[] digits) {
    int i = digits.length - 1;
    boolean overflow = false;
    do {
      if (digits[i] == 9) {
        digits[i] = 0;
        overflow = true;
      } else {
        digits[i] = digits[i] + 1;
        overflow = false;
      }
      i--;
    } while (i >= 0 && overflow);
    if (i == -1 && overflow) {
      digits = prependOne(digits);
    }
    return digits;
  }

  private int[] prependOne(int[] array) {
    int[] result = new int[array.length + 1];
    result[0] = 1;
    for (int i = 1; i < array.length; i++) {
      result[i] = array[i - 1];
    }
    return result;
  }
}

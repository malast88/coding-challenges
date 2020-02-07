package io.github.malast88.coding.leetcode;

public class ReverseInteger {
  /**
   * Solution for Leetcode problem "Reverse Integer" https://leetcode.com/problems/reverse-integer .
   *
   * @param x integer to reverse its digits
   * @return integer which is composed from {@param x} reversed digits, or 0 in case of 32 bits
   *     overflow
   */
  /*
   * # Solution
   * Start from 0 result.
   * Divide the input number by 10 until its 0.
   * Each time multiply result by 10, check for overflow.
   * In case no overflow, add the current modulus of input by 10.
   *
   * ## Overflow check
   * There is overflow after multiplication of the number by 10, if the result of the multiplication, divided by 10,
   * does not equal to this number.
   *
   * _Complexity - O(1)_
   *
   * _Space - O(1)_
   */
  public int reverse(int x) {
    int result = 0;
    while (x != 0) {
      int newResult = result * 10;
      // overflow check
      if (newResult / 10 != result) {
        return 0;
      }
      result = newResult + x % 10;
      x /= 10;
    }
    return result;
  }
}

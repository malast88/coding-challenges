package io.github.malast88.coding.leetcode;

public class SqrtX {
  /**
   * Solution for Leetcode problem "Sqrt X" https://leetcode.com/problems/sqrtx/ .
   *
   * @param x input integer
   * @return square root of {@param digits} truncated to int
   */
  /*
   * # Solution
   * Use binary search among all possible square roots from 0 to x.
   * To avoid overflow, limit the upper bound by 46340 - the largest possible truncated square root
   * of a positive integer.
   * Finally, ensure that found number squared not greater than x.
   *
   * _Complexity - O(1) - because int is a limited data type
   *
   * _Space - O(1)_
   */
  public int mySqrt(int x) {
    int min = 0;
    int max = Integer.min(x, 46340);
    while (min < max) {
      int mid = (max + min) / 2;
      int sqr = mid * mid;
      if (sqr == x) {
        return mid;
      }
      if (sqr > x) {
        max = mid - 1;
      } else {
        min = mid + 1;
      }
    }
    while (min * min > x) {
      min--;
    }
    return min;
  }
}

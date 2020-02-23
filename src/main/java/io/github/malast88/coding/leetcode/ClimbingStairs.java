package io.github.malast88.coding.leetcode;

public class ClimbingStairs {
  /**
   * Solution for Leetcode problem "Climbing Stairs" https://leetcode.com/problems/climbing-stairs/
   * .
   *
   * @param n Number of stairs
   * @return Count of ways to climb {@param n} stairs by moving 1 or 2 stairs one time.
   */
  /*
   * # Solution
   * Formula is f(n) = f(n-2) + f(n-1) for n >= 4, so it is basically Fibonacci sequence.
   *
   * _Complexity - O(n)
   *
   * _Space - O(1)_
   */
  public int climbStairs(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    int fprev2 = 1;
    int fprev1 = 2;
    int fn = 3;
    for (int i = 4; i <= n; i++) {
      fprev2 = fprev1;
      fprev1 = fn;
      fn = fprev1 + fprev2;
    }
    return fn;
  }
}

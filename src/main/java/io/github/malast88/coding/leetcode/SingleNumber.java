package io.github.malast88.coding.leetcode;

public class SingleNumber {
  /**
   * Solution for Leetcode problem "Single Number" https://leetcode.com/problems/single-number/ .
   *
   * @param nums array of integers to find the single number
   * @return the one single element of {@param nums}
   */
  /*
   * # Solution
   * Apply XOR operation to all elements of the array.
   *
   * _Complexity - O(n)
   *
   * _Space - O(1)_
   */
  public int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }
    return result;
  }
}

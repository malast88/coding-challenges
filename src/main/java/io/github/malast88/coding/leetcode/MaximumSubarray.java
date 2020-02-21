package io.github.malast88.coding.leetcode;

public class MaximumSubarray {
  /**
   * Solution for Leetcode problem "Maximum subarray"
   * https://leetcode.com/problems/maximum-subarray/ .
   *
   * @param nums Input array
   * @return Maximal subarray sum of {@param nums}
   */
  /*
   * # Solution
   * Use Kadane's algorithm https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm
   *
   * _Complexity - O(n)
   *
   * _Space - O(1)_
   */
  public int maxSubArray(int[] nums) {
    int maxSum = nums[0];
    int currSum = maxSum;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > currSum + nums[i]) {
        currSum = nums[i];
      } else {
        currSum = currSum + nums[i];
      }
      if (currSum > maxSum) {
        maxSum = currSum;
      }
    }
    return maxSum;
  }
}

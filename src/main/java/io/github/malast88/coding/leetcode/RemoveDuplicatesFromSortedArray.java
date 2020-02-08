package io.github.malast88.coding.leetcode;

public class RemoveDuplicatesFromSortedArray {
  /**
   * Solution for Leetcode problem "Remove Duplicates from Sorted Array"
   * https://leetcode.com/problems/remove-duplicates-from-sorted-array/ .
   *
   * @param nums sorted array of integers to remove duplicates from
   * @return new length of {@param x} is palindrome, false otherwise
   */
  /*
   * # Solution
   * Iterate over an array using two indices.
   * First index points to the current end of new array without duplicates.
   * Second index points to the next element of the old array.
   * Iteratively increase second index until it points to the different element than first.
   * Put that different element after first index and increment first index by 1.
   * Repeat.
   *
   * _Complexity - O(n)_
   *
   * _Space - O(1)_
   */
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int i = 0;
    int j = 1;
    while (j < nums.length) {
      while (j < nums.length && nums[i] == nums[j]) {
        j++;
      }
      if (j < nums.length) {
        nums[i + 1] = nums[j];
        i++;
      }
    }
    return i + 1;
  }
}

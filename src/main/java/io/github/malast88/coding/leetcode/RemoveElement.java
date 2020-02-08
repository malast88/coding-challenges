package io.github.malast88.coding.leetcode;

public class RemoveElement {
  /**
   * Solution for Leetcode problem "Remove Element" https://leetcode.com/problems/remove-element/ .
   *
   * @param nums array of integers to remove {@param val} from
   * @param val value to remove from an array
   * @return new length of {@param nums} array after removal of {@param val} from it
   */
  /*
   * # Solution
   * Maintain the current index of the new array.
   * Iterate over the old array and each time the current element of the old array is not equal
   * to value which should be removed, put it into the current index of the new array and increment
   * the new array's current index.
   *
   * _Complexity - O(n)_
   *
   * _Space - O(1)_
   */
  public int removeElement(int[] nums, int val) {
    int curr = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[curr] = nums[i];
        curr++;
      }
    }
    return curr;
  }
}

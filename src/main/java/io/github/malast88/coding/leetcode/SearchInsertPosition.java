package io.github.malast88.coding.leetcode;

public class SearchInsertPosition {
  /**
   * Solution for Leetcode problem "Search Insert Position"
   * https://leetcode.com/problems/search-insert-position/ .
   *
   * @param nums Sorted array of integers where find the insert position of the {@param target}
   * @param target Value to find the insert position
   * @return Position of {@param target} in the {@param nums} or the position where it could be
   *     inserted
   */
  /*
   * # Solution
   * Perform binary search.
   * If target greater than the element on the found position - return found position + 1.
   * Otherwise, target is either equal or less than the element of the found position so
   * should be exactly on it.
   *
   * _Complexity - O(log(n))_ where n==size of nums
   *
   * _Space - O(1)_
   */
  public int searchInsert(int[] nums, int target) {
    if (nums.length == 0) {
      return 0;
    }
    int min = 0;
    int max = nums.length - 1;
    while (min < max) {
      int mid = (min + max) / 2;
      if (nums[mid] == target) {
        return mid;
      } else {
        if (nums[mid] > target) {
          max = mid - 1;
        } else {
          min = mid + 1;
        }
      }
    }
    if (nums[min] < target) {
      return min + 1;
    } else {
      return min;
    }
  }
}

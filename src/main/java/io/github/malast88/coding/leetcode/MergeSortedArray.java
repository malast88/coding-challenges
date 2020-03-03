package io.github.malast88.coding.leetcode;

public class MergeSortedArray {
  /**
   * Solution for Leetcode problem "Merge Sorted Array"
   * https://leetcode.com/problems/merge-sorted-array/ .
   *
   * @param nums1 array where merge into
   * @param nums2 array which be merged into {@param nums1}
   * @return {@param nums1} containing merged data
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(n)_
   */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int nums1Idx = m - 1;
    int nums2Idx = n - 1;
    int destIdx = nums1.length - 1;
    while (nums2Idx >= 0) {
      if (nums1Idx < 0 || nums2[nums2Idx] > nums1[nums1Idx]) {
        nums1[destIdx--] = nums2[nums2Idx--];
      } else {
        nums1[destIdx--] = nums1[nums1Idx--];
      }
    }
  }
}

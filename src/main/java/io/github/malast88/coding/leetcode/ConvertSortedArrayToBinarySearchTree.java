package io.github.malast88.coding.leetcode;

public class ConvertSortedArrayToBinarySearchTree {
  /**
   * Solution for Leetcode problem "Symmetric Tree" https://leetcode.com/problems/symmetric-tree/ .
   *
   * @param nums sorted array
   * @return result of conversion {@param root} to height-balanced BST
   */
  /*
   * # Solution
   *
   * _Complexity - O(log(n))
   *
   * _Space - O(n)_
   */
  public TreeNode sortedArrayToBST(int[] nums) {
    return sortedArrayToBST(nums, 0, nums.length - 1);
  }

  private TreeNode sortedArrayToBST(int[] nums, int from, int to) {
    if (from > to) {
      return null;
    }
    int rootIdx = (from + to) / 2;
    TreeNode result = new TreeNode(nums[rootIdx]);
    result.left = sortedArrayToBST(nums, from, rootIdx - 1);
    result.right = sortedArrayToBST(nums, rootIdx + 1, to);
    return result;
  }
}

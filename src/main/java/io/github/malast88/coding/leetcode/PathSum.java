package io.github.malast88.coding.leetcode;

public class PathSum {
  /**
   * Solution for Leetcode problem "Path Sum" https://leetcode.com/problems/path-sum/ .
   *
   * @param root root of the tree
   * @param sum sum to check if any path in the tree sums up to
   * @return true if {@param root} contains a path from root to leaf which sums to {@param sum}
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(log(n))_ (needs stack to traverse the tree)
   */
  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    return hasPathSum(root, sum, 0);
  }

  private boolean hasPathSum(TreeNode root, int targetSum, int currentSum) {
    if (root.left == null && root.right == null) {
      return targetSum == currentSum + root.val;
    }
    return root.left != null && hasPathSum(root.left, targetSum, currentSum + root.val)
        || root.right != null && hasPathSum(root.right, targetSum, currentSum + root.val);
  }
}

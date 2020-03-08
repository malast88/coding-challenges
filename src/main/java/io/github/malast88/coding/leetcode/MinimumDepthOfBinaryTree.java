package io.github.malast88.coding.leetcode;

public class MinimumDepthOfBinaryTree {
  /**
   * Solution for Leetcode problem "Minimum Depth of Binary Tree"
   * https://leetcode.com/problems/minimum-depth-of-binary-tree/ .
   *
   * @param root root of the input tree
   * @return minimum length of the path from root to leaf in the tree {@param root}
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(log(n))_ (needs stack to traverse the tree)
   */
  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return minDepth(root, 1);
  }

  private int minDepth(TreeNode root, int level) {
    if (root.left == null && root.right == null) {
      return level;
    }
    if (root.left != null && root.right != null) {
      return Math.min(minDepth(root.left, level + 1), minDepth(root.right, level + 1));
    }
    if (root.left == null) {
      return minDepth(root.right, level + 1);
    }
    return minDepth(root.left, level + 1);
  }
}

package io.github.malast88.coding.leetcode;

public class BalancedBinaryTree {
  /**
   * Solution for Leetcode problem "Balanced Binary Tree"
   * https://leetcode.com/problems/balanced-binary-tree/ .
   *
   * @param root root of the input tree
   * @return true if {@param root} is balanced
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(log(n))_ (needs stack to traverse the tree)
   */
  public boolean isBalanced(TreeNode root) {
    return getHeightAndIsBalanced(root).isBalanced;
  }

  private class HeightAndBalancedData {
    public int height;
    public boolean isBalanced;

    public HeightAndBalancedData(boolean isBalanced) {
      this.isBalanced = isBalanced;
    }
  }

  private HeightAndBalancedData getHeightAndIsBalanced(TreeNode root) {
    if (root == null) {
      return new HeightAndBalancedData(true);
    }
    HeightAndBalancedData leftData = getHeightAndIsBalanced(root.left);
    HeightAndBalancedData rightData = getHeightAndIsBalanced(root.right);
    HeightAndBalancedData result =
        new HeightAndBalancedData(
            leftData.isBalanced
                && rightData.isBalanced
                && Math.abs(leftData.height - rightData.height) <= 1);
    result.height = Math.max(leftData.height, rightData.height) + 1;
    return result;
  }
}

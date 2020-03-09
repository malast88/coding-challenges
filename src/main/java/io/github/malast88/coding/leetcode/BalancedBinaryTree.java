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
    return getHeightAndIsBalanced(root).isBalanced();
  }

  private class HeightAndBalancedData {
    private final int height;
    private final boolean balanced;

    public HeightAndBalancedData(boolean balanced, int height) {
      this.balanced = balanced;
      this.height = height;
    }

    public int getHeight() {
      return height;
    }

    public boolean isBalanced() {
      return balanced;
    }
  }

  private HeightAndBalancedData getHeightAndIsBalanced(TreeNode root) {
    if (root == null) {
      return new HeightAndBalancedData(true, 0);
    }
    HeightAndBalancedData leftData = getHeightAndIsBalanced(root.left);
    HeightAndBalancedData rightData = getHeightAndIsBalanced(root.right);
    return new HeightAndBalancedData(
        leftData.isBalanced()
            && rightData.isBalanced()
            && Math.abs(leftData.getHeight() - rightData.getHeight()) <= 1,
        Math.max(leftData.getHeight(), rightData.getHeight()) + 1);
  }
}

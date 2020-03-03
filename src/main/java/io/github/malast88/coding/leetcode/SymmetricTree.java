package io.github.malast88.coding.leetcode;

public class SymmetricTree {
  /**
   * Solution for Leetcode problem "Symmetric Tree" https://leetcode.com/problems/symmetric-tree/ .
   *
   * @param root root of the input tree
   * @return true if {@param root} is symmetric (mirror of itself)
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(n)_ (needs stack to traverse the tree)
   */
  public boolean isSymmetric(TreeNode root) {
    return root == null || isMirror(root.left, root.right);
  }

  private boolean isMirror(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p != null && q != null) {
      return p.val == q.val && isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
    return false;
  }
}

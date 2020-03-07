package io.github.malast88.coding.leetcode;

public class SameTree {
  /**
   * Solution for Leetcode problem "Same Tree" https://leetcode.com/problems/same-tree/ .
   *
   * @param p first tree
   * @param q second tree
   * @return true if {@param p} is exactly the same tree as {@param q}
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(log(n))_ (needs stack to traverse the tree)
   */
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p != null && q != null) {
      return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    return false;
  }
}

package io.github.malast88.coding.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversal2 {
  /**
   * Solution for Leetcode problem "Binary Tree Level Order Traversal II
   * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/ .
   *
   * @param root root of the input tree
   * @return reversed result of the tree traversal by level
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(n)_
   */
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    result = traverse(root, 0, result);
    Collections.reverse(result);
    return result;
  }

  private List<List<Integer>> traverse(
      TreeNode node, int level, List<List<Integer>> traverseResult) {
    if (node == null) {
      return traverseResult;
    }
    while (traverseResult.size() < level + 1) {
      traverseResult.add(new ArrayList<>());
    }
    traverseResult.get(level).add(node.val);
    traverseResult = traverse(node.left, level + 1, traverseResult);
    traverseResult = traverse(node.right, level + 1, traverseResult);
    return traverseResult;
  }
}

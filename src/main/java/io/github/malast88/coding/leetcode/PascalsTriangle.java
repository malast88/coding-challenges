package io.github.malast88.coding.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
  /**
   * Solution for Leetcode problem "Pascal's Triangle"
   * https://leetcode.com/problems/pascals-triangle/ .
   *
   * @param numRows number of first rows of Pascal's triangle to generate
   * @return first {@param numRows} rows of Pascal's triangle
   */
  /*
   * # Solution
   *
   * _Complexity - O(n^2)
   *
   * _Space - O(n^2)_
   */
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    if (numRows > 0) {
      result.add(Arrays.asList(1));
    }
    for (int i = 2; i <= numRows; i++) {
      result.add(generate(result.get(i - 2)));
    }
    return result;
  }

  private List<Integer> generate(List<Integer> prev) {
    int n = prev.size();
    List<Integer> result = Arrays.asList(new Integer[n + 1]);
    result.set(0, 1);
    result.set(n, 1);
    for (int i = 1; i < n; i++) {
      result.set(i, prev.get(i - 1) + prev.get(i));
    }
    return result;
  }
}

package io.github.malast88.coding.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalsTriangle2 {
  /**
   * Solution for Leetcode problem "Pascal's Triangle II"
   * https://leetcode.com/problems/pascals-triangle-ii/ .
   *
   * @param rowIndex zero-based index of the row to be returned
   * @return {@param rowIndex}s row of Pascal's triangle
   */
  /*
   * # Solution
   *
   * _Complexity - O(n^2)
   *
   * _Space - O(n)_
   */
  public List<Integer> getRow(int rowIndex) {
    rowIndex++;
    int[] result = new int[rowIndex];
    if (rowIndex > 0) {
      result[0] = 1;
    }
    for (int i = 2; i <= rowIndex; i++) {
      getRow(result, i);
    }
    return Arrays.stream(result).boxed().collect(Collectors.toList());
  }

  private void getRow(int[] prev, int k) {
    prev[k - 1] = 1;
    for (int i = k - 2; i >= 1; i--) {
      prev[i] = prev[i] + prev[i - 1];
    }
  }
}

package io.github.malast88.coding.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountAndSay {
  /**
   * Solution for Leetcode problem "Count and Say" https://leetcode.com/problems/count-and-say/ .
   *
   * @param n Number of the count-and-say sequence to return
   * @return {@param n}th element of the count-and-say sequence
   */
  /*
   * # Solution
   *
   * _Complexity - O(2^n)
   *
   * _Space - O(2^n)_
   */
  public String countAndSay(int n) {
    List<Integer> curr = new ArrayList<>();
    curr.add(1);
    for (int i = 2; i <= n; i++) {
      curr = transform(curr);
    }
    return listToStr(curr);
  }

  private List<Integer> transform(List<Integer> list) {
    List<Integer> result = new ArrayList<>(list.size() * 2);
    int curr = 0;
    while (curr < list.size()) {
      int count = 0;
      int next = curr;
      while (next < list.size() && list.get(curr).equals(list.get(next))) {
        count++;
        next++;
      }
      result.add(count);
      result.add(list.get(curr));
      curr = next;
    }
    return result;
  }

  private String listToStr(List<Integer> list) {
    StringBuilder sb = new StringBuilder(list.size());
    for (int i = 0; i < list.size(); i++) {
      sb.append(list.get(i));
    }
    return sb.toString();
  }
}

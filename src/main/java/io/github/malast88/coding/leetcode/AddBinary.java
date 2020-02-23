package io.github.malast88.coding.leetcode;

public class AddBinary {
  /**
   * Solution for Leetcode problem "Add Binary" https://leetcode.com/problems/add-binary .
   *
   * @param p first binary string
   * @param q second binary string
   * @return binary string which is a sum of {@param p} and {@param q}
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(n)_
   */
  public String addBinary(String p, String q) {
    int pi = p.length() - 1;
    int qi = q.length() - 1;
    int overflow = 0;
    StringBuilder res = new StringBuilder();
    do {
      int sum = getIntAt(p, pi) + getIntAt(q, qi) + overflow;
      overflow = sum / 2;
      res.append(sum % 2);
      pi--;
      qi--;
    } while (pi >= 0 || qi >= 0);
    if (overflow > 0) {
      res.append(1);
    }
    return res.reverse().toString();
  }

  private int getIntAt(String s, int idx) {
    if (idx < 0 || s.charAt(idx) == '0') {
      return 0;
    }
    return 1;
  }
}

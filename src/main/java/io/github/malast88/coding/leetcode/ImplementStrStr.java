package io.github.malast88.coding.leetcode;

public class ImplementStrStr {
  /**
   * Solution for Leetcode problem "Implement strStr()"
   * https://leetcode.com/problems/implement-strstr/ .
   *
   * @param haystack String where to find {@param needle}
   * @param needle String to find in {@param haystack}
   * @return position of {@param needle} in {@param haystack} or -1 if it was not found
   */
  /*
   * # Solution
   * For each position where needle fits into haystack, check if needle is a substring of haystack
   * at that position.
   *
   * _Complexity - O(n*m)_ where n==haystack length and m==needle length
   *
   * _Space - O(1)_
   */
  public int strStr(String haystack, String needle) {
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      if (isSubstringAt(haystack, needle, i)) {
        return i;
      }
    }
    return -1;
  }

  private boolean isSubstringAt(String str, String sub, int idx) {
    for (int i = 0; i < sub.length(); i++) {
      if (str.charAt(idx + i) != sub.charAt(i)) {
        return false;
      }
    }
    return true;
  }
}

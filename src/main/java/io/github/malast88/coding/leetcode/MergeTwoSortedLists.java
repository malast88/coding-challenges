package io.github.malast88.coding.leetcode;

public class MergeTwoSortedLists {
  /**
   * Solution for Leetcode problem "Merge Two Sorted Lists"
   * https://leetcode.com/problems/merge-two-sorted-lists/ .
   *
   * @param a first linked list. Should be sorted.
   * @param b second linked list. Should be sorted.
   * @return linked list which consists from merged lists {@param a} and {@param b}
   */
  /*
   * # Solution
   * In case one of the lists is empty - another one will be a result.
   * Otherwise, iteratively attach first node of one or another list to the result.
   * Start constructing the result from the first node of a or b,
   * depending which node has lower value.
   * Then iterate over both lists until one of the lists is empty.
   * In the end, attach the list left non-empty to the end of the result.
   *
   * _Complexity - O(n)_
   *
   * _Space - O(1)_
   */
  public ListNode mergeTwoLists(ListNode a, ListNode b) {
    if (a == null) {
      return b;
    }
    if (b == null) {
      return a;
    }
    ListNode result = a.val < b.val ? a : b;
    ListNode curr = result;
    if (a.val < b.val) {
      a = a.next;
    } else {
      b = b.next;
    }
    while (a != null && b != null) {
      if (a.val < b.val) {
        curr.next = a;
        a = a.next;
      } else {
        curr.next = b;
        b = b.next;
      }
      curr = curr.next;
    }
    if (a == null) {
      curr.next = b;
    } else {
      curr.next = a;
    }
    return result;
  }
}

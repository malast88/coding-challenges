package io.github.malast88.coding.leetcode;

public class RemoveDuplicatesFromSortedList {
  /**
   * Solution for Leetcode problem "Remove Duplicates from Sorted List" https://leetcode.com/problems/remove-duplicates-from-sorted-list/ .
   *
   * @param head head of the input list
   * @return {@param head} of the list without duplicates
   */
  /*
   * # Solution
   *
   * _Complexity - O(n)
   *
   * _Space - O(1)_
   */
  public ListNode deleteDuplicates(ListNode head) {
    ListNode curr = head;
    while (curr != null) {
      ListNode fwd = curr;
      while (fwd != null && fwd.val == curr.val) {
        fwd = fwd.next;
      }
      curr.next = fwd;
      curr = fwd;
    }
    return head;
  }
}

package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ListNodeUtils {
  public static ListNode build(int... data) {
    if (data.length == 0) {
      return null;
    }
    ListNode result = new ListNode(data[0]);
    ListNode curr = result;
    for (int i = 1; i < data.length; i++) {
      curr.next = new ListNode(data[i]);
      curr = curr.next;
    }
    return result;
  }

  public static boolean isEqualByVal(ListNode a, ListNode b) {
    if (a == null && b == null) {
      return true;
    }
    while (a != null && b != null) {
      if (a.val != b.val) {
        return false;
      }
      a = a.next;
      b = b.next;
    }
    return a == null && b == null;
  }

  @Test
  public void itShouldBuildEmptyListFromEmptyArray() {
    // arrange

    // act
    ListNode actual = ListNodeUtils.build();

    // assert
    assertEquals(null, actual);
  }

  @Test
  public void itShouldBuildListFromArray() {
    // arrange

    // act
    ListNode actual = ListNodeUtils.build(3, 2, 1);

    // assert
    assertNotNull(actual);
    assertEquals(3, actual.val);
    assertNotNull(actual.next);
    assertEquals(2, actual.next.val);
    assertNotNull(actual.next.next);
    assertEquals(1, actual.next.next.val);
    assertNull(actual.next.next.next);
  }

  @Test
  public void itShouldConsiderTwoEmptyListsEqualByVal() {
    // arrange

    // act
    boolean actual = ListNodeUtils.isEqualByVal(null, null);

    // assert
    assertTrue(actual);
  }

  @Test
  public void itShouldConsiderListsWithSameNumberOfSameValuesEqualByVal() {
    // arrange
    ListNode a = ListNodeUtils.build(3, 2, 1);
    ListNode b = ListNodeUtils.build(3, 2, 1);
    assertNotEquals(a, b);

    // act
    boolean actual = ListNodeUtils.isEqualByVal(a, b);

    // assert
    assertTrue(actual);
  }

  @Test
  public void itShouldConsiderListsWithDifferentValuesNotEqualByVal() {
    // arrange
    ListNode a = ListNodeUtils.build(3, 2, 1);
    ListNode b = ListNodeUtils.build(3, 4, 1);
    assertNotEquals(a, b);

    // act
    boolean actual = ListNodeUtils.isEqualByVal(a, b);

    // assert
    assertFalse(actual);
  }

  @Test
  public void itShouldConsiderListsWhichOneIsLongerNotEqualByVal() {
    // arrange
    ListNode a = ListNodeUtils.build(3, 2, 1, 3);
    ListNode b = ListNodeUtils.build(3, 2, 1);
    assertNotEquals(a, b);

    // act
    boolean actual = ListNodeUtils.isEqualByVal(a, b);

    // assert
    assertFalse(actual);
  }
}

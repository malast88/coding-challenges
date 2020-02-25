package io.github.malast88.coding.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.github.malast88.coding.leetcode.ListNodeUtils.build;
import static io.github.malast88.coding.leetcode.ListNodeUtils.isEqualByVal;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveDuplicatesFromSortedListTest {

  private static Stream<Arguments> getRemoveDuplicatesFromSortedListArgs() {
    return Stream.of(
            Arguments.of(build(), build()),
            Arguments.of(build(1, 2, 3), build(1, 2, 3)),
            Arguments.of(build(1, 2, 3, 3, 4, 5, 5, 6), build(1, 2, 3, 4, 5, 6)));
  }

  @ParameterizedTest
  @MethodSource("getRemoveDuplicatesFromSortedListArgs")
  public void itShouldRemoveDuplicatesFromSortedList(ListNode head, ListNode expected) {
    // arrange
    RemoveDuplicatesFromSortedList sut = new RemoveDuplicatesFromSortedList();

    // act
    ListNode actual = sut.deleteDuplicates(head);

    // assert
    assertTrue(isEqualByVal(expected, actual));
  }
}

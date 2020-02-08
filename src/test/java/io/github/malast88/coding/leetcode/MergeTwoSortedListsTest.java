package io.github.malast88.coding.leetcode;

import static io.github.malast88.coding.leetcode.ListNodeUtils.build;
import static io.github.malast88.coding.leetcode.ListNodeUtils.isEqualByVal;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MergeTwoSortedListsTest {

  private static Stream<Arguments> getMergeTwoListsArgs() {
    return Stream.of(
        Arguments.of(build(), build(), build()),
        Arguments.of(build(), build(1), build(1)),
        Arguments.of(build(1), build(), build(1)),
        Arguments.of(build(1, 2, 4), build(1, 3, 4), build(1, 1, 2, 3, 4, 4)),
        Arguments.of(build(4, 5, 6), build(1, 2, 3), build(1, 2, 3, 4, 5, 6)),
        Arguments.of(build(1, 2, 3), build(4, 5, 6), build(1, 2, 3, 4, 5, 6)));
  }

  @ParameterizedTest
  @MethodSource("getMergeTwoListsArgs")
  public void itShouldMergeTwoLists(ListNode a, ListNode b, ListNode expected) {
    // arrange
    MergeTwoSortedLists sut = new MergeTwoSortedLists();

    // act
    ListNode actual = sut.mergeTwoLists(a, b);

    // assert
    assertTrue(isEqualByVal(expected, actual));
  }
}

package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchInsertPositionTest {

  private static Stream<Arguments> geSearchInsertPositionArgs() {
    return Stream.of(
        Arguments.of(new int[] {1, 3, 6, 9, 17}, 5, 2),
        Arguments.of(new int[] {1, 2, 3, 5, 6}, 5, 3),
        Arguments.of(new int[] {5, 17, 23}, 40, 3),
        Arguments.of(new int[] {5}, 5, 0),
        Arguments.of(new int[] {1}, 5, 1),
        Arguments.of(new int[] {}, 5, 0));
  }

  @ParameterizedTest
  @MethodSource("geSearchInsertPositionArgs")
  public void itShouldSearchInsertPosition(int[] nums, int target, int expected) {
    // arrange
    SearchInsertPosition sut = new SearchInsertPosition();

    // act
    int actual = sut.searchInsert(nums, target);

    // assert
    assertEquals(expected, actual);
  }
}

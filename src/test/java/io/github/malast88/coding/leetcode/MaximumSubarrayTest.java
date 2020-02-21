package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MaximumSubarrayTest {

  private static Stream<Arguments> getMaximumSubarraySumArgs() {
    return Stream.of(
        Arguments.of(new int[] {15}, 15),
        Arguments.of(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
        Arguments.of(new int[] {-3, -7, -1, -16}, -1),
        Arguments.of(new int[] {1, 2, 3}, 6));
  }

  @ParameterizedTest
  @MethodSource("getMaximumSubarraySumArgs")
  public void itShouldFindMaximumSubarraySum(int[] nums, int expected) {
    // arrange
    MaximumSubarray sut = new MaximumSubarray();

    // act
    int actual = sut.maxSubArray(nums);

    // assert
    assertEquals(expected, actual);
  }
}

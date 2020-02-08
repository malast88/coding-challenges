package io.github.malast88.coding.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

  private static Stream<Arguments> getRemoveDuplicatesArgs() {
    return Stream.of(
            Arguments.of(new int[] {}, 0, new int[] {}),
            Arguments.of(new int[] {1, 2, 3}, 3, new int[] {1, 2, 3}),
            Arguments.of(new int[] {1, 1, 2, 3, 3}, 3, new int[] {1, 2, 3}));
  }

  @ParameterizedTest
  @MethodSource("getRemoveDuplicatesArgs")
  public void itShouldRemoveDuplicates(int[] nums, int expectedLength, int[] expectedNums) {
    // arrange
    RemoveDuplicatesFromSortedArray sut = new RemoveDuplicatesFromSortedArray();

    // act
    int actualLength = sut.removeDuplicates(nums);

    // assert
    assertEquals(expectedLength, actualLength);
    int[] actualNums = new int[actualLength];
    for (int i=0;i<actualLength;i++) {
      actualNums[i] = nums[i];
    }
    assertArrayEquals(expectedNums, actualNums);
  }
}

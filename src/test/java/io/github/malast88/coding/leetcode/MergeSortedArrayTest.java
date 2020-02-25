package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MergeSortedArrayTest {

  private static Stream<Arguments> getMergeSortedArrayArgs() {
    return Stream.of(
        Arguments.of(
            new int[] {1, 3, 5, 0, 0, 0}, 3, new int[] {1, 2, 6}, 3, new int[] {1, 1, 2, 3, 5, 6}),
        Arguments.of(new int[] {1, 2, 3}, 3, new int[] {}, 0, new int[] {1, 2, 3}));
  }

  @ParameterizedTest
  @MethodSource("getMergeSortedArrayArgs")
  public void itShouldMergeSortedArray(int[] nums1, int m, int[] nums2, int n, int[] expected) {
    // arrange
    MergeSortedArray sut = new MergeSortedArray();

    // act
    sut.merge(nums1, m, nums2, n);

    // assert
    assertArrayEquals(expected, nums1);
  }
}

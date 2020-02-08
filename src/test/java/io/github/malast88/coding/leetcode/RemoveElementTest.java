package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveElementTest {

  private static Stream<Arguments> getRemoveElementArgs() {
    return Stream.of(
        Arguments.of(new int[] {}, 0, 0, new int[] {}),
        Arguments.of(new int[] {0, 1, 7, 7, 3, 0, 4, 7}, 7, 5, new int[] {0, 1, 3, 0, 4}));
  }

  @ParameterizedTest
  @MethodSource("getRemoveElementArgs")
  public void itShouldRemoveElement(int[] nums, int val, int expectedLength, int[] expectedNums) {
    // arrange
    RemoveElement sut = new RemoveElement();

    // act
    int actualLength = sut.removeElement(nums, val);

    // assert
    assertEquals(expectedLength, actualLength);
    int[] actualNums = new int[actualLength];
    for (int i = 0; i < actualLength; i++) {
      actualNums[i] = nums[i];
    }
    assertArrayEquals(expectedNums, actualNums);
  }
}

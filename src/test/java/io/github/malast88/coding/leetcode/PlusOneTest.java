package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PlusOneTest {

  private static Stream<Arguments> gePlusOneArgs() {
    return Stream.of(
        Arguments.of(new int[] {0}, new int[] {1}),
        Arguments.of(new int[] {1, 2, 3, 4}, new int[] {1, 2, 3, 5}),
        Arguments.of(new int[] {9, 8, 9}, new int[] {9, 9, 0}),
        Arguments.of(new int[] {9}, new int[] {1, 0}),
        Arguments.of(new int[] {9, 9, 9}, new int[] {1, 0, 0, 0}));
  }

  @ParameterizedTest
  @MethodSource("gePlusOneArgs")
  public void itShouldPlusOne(int[] digits, int[] expected) {
    // arrange
    PlusOne sut = new PlusOne();

    // act
    int[] actual = sut.plusOne(digits);

    // assert
    assertArrayEquals(expected, actual);
  }
}

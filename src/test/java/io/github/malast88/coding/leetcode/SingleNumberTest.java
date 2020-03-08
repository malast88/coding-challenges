package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SingleNumberTest {

  private static Stream<Arguments> getSingleNumberArgs() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 1}, 2),
        Arguments.of(new int[] {1, 2, 1, 2, 3}, 3),
        Arguments.of(new int[] {1, 2, 2, 1, 3}, 3));
  }

  @ParameterizedTest
  @MethodSource("getSingleNumberArgs")
  public void itShouldFindSingleNumber(int[] nums, int expected) {
    // arrange
    SingleNumber sut = new SingleNumber();

    // act
    int actual = sut.singleNumber(nums);

    // assert
    assertEquals(expected, actual);
  }
}

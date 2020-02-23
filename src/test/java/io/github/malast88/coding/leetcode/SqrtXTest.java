package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SqrtXTest {

  private static Stream<Arguments> getSqrtArgs() {
    return Stream.of(
        Arguments.of(0, 0),
        Arguments.of(1, 1),
        Arguments.of(2, 1),
        Arguments.of(3, 1),
        Arguments.of(4, 2),
        Arguments.of(8, 2),
        Arguments.of(9, 3),
        Arguments.of(17, 4),
        Arguments.of(2147483647, 46340));
  }

  @ParameterizedTest
  @MethodSource("getSqrtArgs")
  public void itShouldFindSqrt(int x, int expected) {
    // arrange
    SqrtX sut = new SqrtX();

    // act
    int actual = sut.mySqrt(x);

    // assert
    assertEquals(expected, actual);
  }
}

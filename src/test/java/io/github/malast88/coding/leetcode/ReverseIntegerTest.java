package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseIntegerTest {

  private static Stream<Arguments> getReverseIntegerArgs() {
    return Stream.of(
        Arguments.of(123, 321),
        Arguments.of(-123, -321),
        Arguments.of(0, 0),
        Arguments.of(1000000009, 0),
        Arguments.of(-1000000009, 0));
  }

  @ParameterizedTest
  @MethodSource("getReverseIntegerArgs")
  public void itShouldReverseInteger(int x, int expected) {
    // arrange
    ReverseInteger sut = new ReverseInteger();

    // act
    int actual = sut.reverse(x);

    // assert
    assertEquals(expected, actual);
  }
}

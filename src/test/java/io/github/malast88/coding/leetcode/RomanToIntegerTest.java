package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RomanToIntegerTest {

  private static Stream<Arguments> getGetRomanIntegerArgs() {
    return Stream.of(
        Arguments.of("III", 3),
        Arguments.of("IV", 4),
        Arguments.of("MCMCDXLVIV", 2349),
        Arguments.of("BIV", 4));
  }

  @ParameterizedTest
  @MethodSource("getGetRomanIntegerArgs")
  public void itShouldGetRomanInteger(String s, int expected) {
    // arrange
    RomanToInteger sut = new RomanToInteger();

    // act
    int actual = sut.romanToInt(s);

    // assert
    assertEquals(expected, actual);
  }
}

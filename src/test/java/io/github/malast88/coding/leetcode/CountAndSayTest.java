package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CountAndSayTest {

  private static Stream<Arguments> geCountAndSayArgs() {
    return Stream.of(
        Arguments.of("1", "1"),
        Arguments.of("2", "11"),
        Arguments.of("3", "21"),
        Arguments.of("4", "1211"),
        Arguments.of("5", "111221"),
        Arguments.of("6", "312211"));
  }

  @ParameterizedTest
  @MethodSource("geCountAndSayArgs")
  public void itShouldCountAndSay(int n, String expected) {
    // arrange
    CountAndSay sut = new CountAndSay();

    // act
    String actual = sut.countAndSay(n);

    // assert
    assertEquals(expected, actual);
  }
}

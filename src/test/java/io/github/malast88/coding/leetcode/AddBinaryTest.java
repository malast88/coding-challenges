package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AddBinaryTest {

  private static Stream<Arguments> geAddBinaryArgs() {
    return Stream.of(
        Arguments.of("1", "1", "10"),
        Arguments.of("101", "0", "101"),
        Arguments.of("10101", "111", "11100"),
        Arguments.of("111", "10101", "11100"),
        Arguments.of("11", "11", "110"));
  }

  @ParameterizedTest
  @MethodSource("geAddBinaryArgs")
  public void itShouldAddBinary(String p, String q, String expected) {
    // arrange
    AddBinary sut = new AddBinary();

    // act
    String actual = sut.addBinary(p, q);

    // assert
    assertEquals(expected, actual);
  }
}

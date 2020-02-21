package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LengthOfLastWordTest {

  private static Stream<Arguments> getLengthOfLastWordArgs() {
    return Stream.of(
        Arguments.of("Quick brown fox", 3),
        Arguments.of("Quick brown  fox   ", 3),
        Arguments.of("", 0),
        Arguments.of("   ", 0));
  }

  @ParameterizedTest
  @MethodSource("getLengthOfLastWordArgs")
  public void itShouldFindLengthOfLastWord(String s, int expected) {
    // arrange
    LengthOfLastWord sut = new LengthOfLastWord();

    // act
    int actual = sut.lengthOfLastWord(s);

    // assert
    assertEquals(expected, actual);
  }
}

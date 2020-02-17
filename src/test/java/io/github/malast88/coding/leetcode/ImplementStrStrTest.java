package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ImplementStrStrTest {

  private static Stream<Arguments> geStrStrArgs() {
    return Stream.of(
        Arguments.of("abcddf", "dd", 3),
        Arguments.of("abcddf", "ddd", -1),
        Arguments.of("abcddf", "", 0),
        Arguments.of("abcddf", "abcddfgh", -1));
  }

  @ParameterizedTest
  @MethodSource("geStrStrArgs")
  public void itShouldImplementStrStr(String haystack, String needle, int expected) {
    // arrange
    ImplementStrStr sut = new ImplementStrStr();

    // act
    int actual = sut.strStr(haystack, needle);

    // assert
    assertEquals(expected, actual);
  }
}

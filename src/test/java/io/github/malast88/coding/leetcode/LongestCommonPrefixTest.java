package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LongestCommonPrefixTest {

  private static Stream<Arguments> getFindTheLongestCommonPrefixArgs() {
    return Stream.of(
        Arguments.of(new String[] {"kitchen", "kitten", "kind"}, "ki"),
        Arguments.of(new String[] {}, ""),
        Arguments.of(new String[] {"", "test"}, ""),
        Arguments.of(new String[] {"done", "do", "does"}, "do"),
        Arguments.of(new String[] {"do", "done", "does"}, "do"));
  }

  @ParameterizedTest
  @MethodSource("getFindTheLongestCommonPrefixArgs")
  public void itShouldFindTheLongestCommonPrefix(String[] strs, String expected) {
    // arrange
    LongestCommonPrefix sut = new LongestCommonPrefix();

    // act
    String actual = sut.longestCommonPrefix(strs);

    // assert
    assertEquals(expected, actual);
  }
}

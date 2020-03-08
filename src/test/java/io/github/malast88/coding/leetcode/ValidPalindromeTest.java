package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidPalindromeTest {

  private static Stream<Arguments> getValidPalindromeArgs() {
    return Stream.of(
        Arguments.of("abc, de  ,. e d cb, a", true),
        Arguments.of(" ,", true),
        Arguments.of("abcd f cba", false));
  }

  @ParameterizedTest
  @MethodSource("getValidPalindromeArgs")
  public void itShouldAnswerIfSIsAValidPalindrome(String s, boolean expected) {
    // arrange
    ValidPalindrome sut = new ValidPalindrome();

    // act
    boolean actual = sut.isPalindrome(s);

    // assert
    assertEquals(expected, actual);
  }
}

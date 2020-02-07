package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidParenthesesTest {

  private static Stream<Arguments> getCheckIfStringIsValidArgs() {
    return Stream.of(
        Arguments.of("", true),
        Arguments.of("([{}]{})", true),
        Arguments.of("()(", false),
        Arguments.of("[)", false),
        Arguments.of("[}", false),
        Arguments.of("(}", false),
        Arguments.of("(]", false),
        Arguments.of("{)", false),
        Arguments.of("{]", false),
        Arguments.of(")", false));
  }

  @ParameterizedTest
  @MethodSource("getCheckIfStringIsValidArgs")
  public void itShouldCheckIfStringIsValid(String s, boolean expected) {
    // arrange
    ValidParentheses sut = new ValidParentheses();

    // act
    boolean actual = sut.isValid(s);

    // assert
    assertEquals(expected, actual);
  }
}

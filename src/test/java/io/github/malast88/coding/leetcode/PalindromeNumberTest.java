package io.github.malast88.coding.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeNumberTest {

    private static Stream<Arguments> getCheckIfNumberIsPalindromeArgs() {
        return Stream.of(
                Arguments.of(-123, false),
                Arguments.of(123, false),
                Arguments.of(121, true),
                Arguments.of(1221, true),
                Arguments.of(12031, false),
                Arguments.of(0, true),
                Arguments.of(1000000009, false)
        );
    }

    @ParameterizedTest
    @MethodSource("getCheckIfNumberIsPalindromeArgs")
    public void itShouldCheckIfNumberIsPalindrome(int x, boolean expected) {
        // arrange
        PalindromeNumber sut = new PalindromeNumber();

        // act
        boolean actual = sut.isPalindrome(x);

        // assert
        assertEquals(expected, actual);
    }
}

package io.github.malast88.coding.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    private static Stream<Arguments> getTwoSumArgs() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 5, 7, 11, 15}, 9, new int[]{1, 3}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{1, 2}, 5, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getTwoSumArgs")
    public void itShouldSolveTwoSum(int[] A, int S, int[] expected) {
        // arrange
        TwoSum sut = new TwoSum();

        // act
        int[] actual = sut.twoSum(A, S);

        // assert
        assertArrayEquals(expected, actual);
    }
}

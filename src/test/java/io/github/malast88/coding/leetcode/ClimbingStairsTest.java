package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ClimbingStairsTest {

  private static Stream<Arguments> getClimbStairsArgs() {
    return Stream.of(
        Arguments.of(1, 1),
        Arguments.of(2, 2),
        Arguments.of(3, 3),
        Arguments.of(4, 5),
        Arguments.of(5, 8));
  }

  @ParameterizedTest
  @MethodSource("getClimbStairsArgs")
  public void itShouldClimbStairs(int n, int expected) {
    // arrange
    ClimbingStairs sut = new ClimbingStairs();

    // act
    int actual = sut.climbStairs(n);

    // assert
    assertEquals(expected, actual);
  }
}

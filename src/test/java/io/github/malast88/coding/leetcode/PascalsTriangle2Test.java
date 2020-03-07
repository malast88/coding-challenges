package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PascalsTriangle2Test {

  private static Stream<Arguments> getGetRowArgs() {
    return Stream.of(
        Arguments.of(0, Arrays.asList(1)),
        Arguments.of(1, Arrays.asList(1, 1)),
        Arguments.of(2, Arrays.asList(1, 2, 1)),
        Arguments.of(3, Arrays.asList(1, 3, 3, 1)),
        Arguments.of(6, Arrays.asList(1, 5, 10, 15, 10, 5, 1)));
  }

  @ParameterizedTest
  @MethodSource("getGetRowArgs")
  public void itShouldGetRow(int rowIndex, List<Integer> expected) {
    // arrange
    PascalsTriangle2 sut = new PascalsTriangle2();

    // act
    List<Integer> actual = sut.getRow(rowIndex);

    // assert
    assertEquals(expected.size(), actual.size());
    Integer[] expectedArray = new Integer[expected.size()];
    Integer[] actualArray = new Integer[expected.size()];
    assertArrayEquals(expectedArray, actualArray);
  }
}

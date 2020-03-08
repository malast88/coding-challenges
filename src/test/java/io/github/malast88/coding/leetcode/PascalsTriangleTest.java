package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PascalsTriangleTest {

  private static Stream<Arguments> getGenerateArgs() {
    return Stream.of(
        Arguments.of(0, Arrays.asList()),
        Arguments.of(1, Arrays.asList(Arrays.asList(1))),
        Arguments.of(
            5,
            Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1))));
  }

  @ParameterizedTest
  @MethodSource("getGenerateArgs")
  public void itShouldGenerate(int numRows, List<List<Integer>> expected) {
    // arrange
    PascalsTriangle sut = new PascalsTriangle();

    // act
    List<List<Integer>> actual = sut.generate(numRows);

    // assert
    assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Integer[] expectedCurrent = new Integer[expected.size()];
      Integer[] actualCurrent = new Integer[expected.size()];
      expected.get(i).toArray(expectedCurrent);
      actual.get(i).toArray(actualCurrent);
      assertArrayEquals(expectedCurrent, actualCurrent);
    }
  }
}

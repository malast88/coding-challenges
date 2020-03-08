package io.github.malast88.coding.leetcode;

import static io.github.malast88.coding.leetcode.TreeNodeUtils.build;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PathSumTest {

  private static Stream<Arguments> getPathSumArgs() {
    return Stream.of(
        Arguments.of(build(), 0, false),
        Arguments.of(build(1, 2, 3), 4, true),
        Arguments.of(build(1, 2, 3), 1, false),
        Arguments.of(build(1, 2, 3), 8, false),
        Arguments.of(build(6, 3, 8, 2, null, 4, 12, 1, null, null, null, 3, 13), 16, false),
        Arguments.of(build(6, 3, 8, 2, null, 4, 12, 1, null, null, null, 3, 13), 21, true));
  }

  @ParameterizedTest
  @MethodSource("getPathSumArgs")
  public void itShouldAnswerIfTreeHasPathSum(TreeNode root, int sum, boolean expected) {
    // arrange
    PathSum sut = new PathSum();

    // act
    boolean actual = sut.hasPathSum(root, sum);

    // assert
    assertEquals(expected, actual);
  }
}

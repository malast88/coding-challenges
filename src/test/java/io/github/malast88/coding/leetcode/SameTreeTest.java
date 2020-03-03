package io.github.malast88.coding.leetcode;

import static io.github.malast88.coding.leetcode.TreeNodeUtils.build;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SameTreeTest {

  private static Stream<Arguments> getIsSameTreeArgs() {
    return Stream.of(
        Arguments.of(build(), build(), true),
        Arguments.of(build(5, 4, 6), build(5, 4, 6), true),
        Arguments.of(build(5, 4, 6, 3), build(5, 4, 6), false),
        Arguments.of(build(5, 4, 6), build(5, 4, 6, 3), false));
  }

  @ParameterizedTest
  @MethodSource("getIsSameTreeArgs")
  public void itShouldAnswerIfTreesAreTheSame(TreeNode p, TreeNode q, boolean expected) {
    // arrange
    SameTree sut = new SameTree();

    // act
    boolean actual = sut.isSameTree(p, q);

    // assert
    assertEquals(expected, actual);
  }
}

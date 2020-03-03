package io.github.malast88.coding.leetcode;

import static io.github.malast88.coding.leetcode.TreeNodeUtils.build;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BalancedBinaryTreeTest {

  private static Stream<Arguments> getIsBalancedTreeArgs() {
    return Stream.of(
        Arguments.of(build(), true),
        Arguments.of(build(1, 2, 2), true),
        Arguments.of(build(1, 2, 3, 1, null, null, 8), true),
        Arguments.of(build(1, 2, null, 3), false),
        Arguments.of(build(1, 2, 2, 1, null, null, 3, -1), false));
  }

  @ParameterizedTest
  @MethodSource("getIsBalancedTreeArgs")
  public void itShouldAnswerIfTreeIsBalanced(TreeNode root, boolean expected) {
    // arrange
    BalancedBinaryTree sut = new BalancedBinaryTree();

    // act
    boolean actual = sut.isBalanced(root);

    // assert
    assertEquals(expected, actual);
  }
}

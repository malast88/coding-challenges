package io.github.malast88.coding.leetcode;

import static io.github.malast88.coding.leetcode.TreeNodeUtils.build;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MinimumDepthOfBinaryTreeTest {

  private static Stream<Arguments> getMinDepthArgs() {
    return Stream.of(
        Arguments.of(build(), 0),
        Arguments.of(build(1), 1),
        Arguments.of(build(1, 2, 2), 2),
        Arguments.of(build(1, 2), 2),
        Arguments.of(build(1, 2, 2, 1, null, null, 3, -1), 3));
  }

  @ParameterizedTest
  @MethodSource("getMinDepthArgs")
  public void itShouldGetMinDepth(TreeNode root, int expected) {
    // arrange
    MinimumDepthOfBinaryTree sut = new MinimumDepthOfBinaryTree();

    // act
    int actual = sut.minDepth(root);

    // assert
    assertEquals(expected, actual);
  }
}

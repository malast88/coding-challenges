package io.github.malast88.coding.leetcode;

import static io.github.malast88.coding.leetcode.TreeNodeUtils.build;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SymmetricTreeTest {

  private static Stream<Arguments> getIsSymmetricTreeArgs() {
    return Stream.of(
        Arguments.of(build(), true),
        Arguments.of(build(1, 2, 2), true),
        Arguments.of(build(1, 2, 2, 3), false));
  }

  @ParameterizedTest
  @MethodSource("getIsSymmetricTreeArgs")
  public void itShouldAnswerIfTreeIsSymmetric(TreeNode root, boolean expected) {
    // arrange
    SymmetricTree sut = new SymmetricTree();

    // act
    boolean actual = sut.isSymmetric(root);

    // assert
    assertEquals(expected, actual);
  }
}

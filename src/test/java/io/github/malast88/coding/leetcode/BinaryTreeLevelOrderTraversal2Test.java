package io.github.malast88.coding.leetcode;

import static io.github.malast88.coding.leetcode.TreeNodeUtils.build;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BinaryTreeLevelOrderTraversal2Test {

  private static Stream<Arguments> getTreeTraversalArgs() {
    return Stream.of(
        Arguments.of(build(), new ArrayList<>()),
        Arguments.of(
            build(5, 3, 6, null, 4, 2, null),
            Arrays.asList(Arrays.asList(4, 2), Arrays.asList(3, 6), Arrays.asList(5))));
  }

  @ParameterizedTest
  @MethodSource("getTreeTraversalArgs")
  public void itShouldGetTreeTraversal(TreeNode root, List<List<Integer>> expected) {
    // arrange
    BinaryTreeLevelOrderTraversal2 sut = new BinaryTreeLevelOrderTraversal2();

    // act
    var actual = sut.levelOrderBottom(root);

    // assert
    assertNotNull(actual);
    assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      assertArrayEquals(expected.get(i).toArray(), actual.get(i).toArray());
    }
  }
}

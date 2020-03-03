package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ConvertSortedArrayToBinarySearchTreeTest {

  private static Stream<Arguments> getSortedArrayToBSTArgs() {
    return Stream.of(
        Arguments.of(new int[] {}, TreeNodeUtils.build()),
        Arguments.of(
            new int[] {-10, -3, 6, 18, 137}, TreeNodeUtils.build(6, -10, 18, null, -3, null, 137)));
  }

  @ParameterizedTest
  @MethodSource("getSortedArrayToBSTArgs")
  public void itShouldConvertSortedArrayToBST(int[] nums, TreeNode expected) {
    // arrange
    ConvertSortedArrayToBinarySearchTree sut = new ConvertSortedArrayToBinarySearchTree();

    // act
    TreeNode actual = sut.sortedArrayToBST(nums);

    // assert
    assertTrue(new SameTree().isSameTree(expected, actual));
  }
}

package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class TreeNodeUtils {
  public static TreeNode build(Integer... data) {
    return getTreeNodeFromArray(0, 0, data);
  }

  private static TreeNode getTreeNodeFromArray(int level, int shift, Integer[] data) {
    int index = 0;
    int pow2 = 1;
    for (int i = 0; i < level; i++) {
      index += pow2;
      pow2 *= 2;
    }
    index += shift;
    if (index < data.length && data[index] != null) {
      TreeNode result = new TreeNode(data[index]);
      result.left = getTreeNodeFromArray(level + 1, shift * 2, data);
      result.right = getTreeNodeFromArray(level + 1, shift * 2 + 1, data);
      return result;
    }
    return null;
  }

  @Test
  public void itShouldBuildEmptyTreeFromTheEmptyArray() {
    // arrange

    // act
    TreeNode actual = TreeNodeUtils.build();

    // assert
    assertEquals(null, actual);
  }

  @Test
  public void itShouldBuildTree() {
    // arrange

    // act
    TreeNode actual = TreeNodeUtils.build(4, 2, 7, null, 3, 6, 8, null, null, 1);

    // assert
    assertNotNull(actual);

    assertEquals(4, actual.val);
    assertNotNull(actual.left);
    assertEquals(2, actual.left.val);
    assertNull(actual.left.left);
    assertNotNull(actual.left.right);
    assertEquals(3, actual.left.right.val);
    assertNotNull(actual.left.right.left);
    assertEquals(1, actual.left.right.left.val);
    assertNull(actual.left.right.right);

    assertNotNull(actual.right);
    assertEquals(7, actual.right.val);
    assertNotNull(actual.right.left);
    assertEquals(6, actual.right.left.val);
    assertNotNull(actual.right.right);
    assertEquals(8, actual.right.right.val);
    assertNull(actual.right.left.left);
    assertNull(actual.right.left.right);
    assertNull(actual.right.right.left);
    assertNull(actual.right.right.right);
  }
}

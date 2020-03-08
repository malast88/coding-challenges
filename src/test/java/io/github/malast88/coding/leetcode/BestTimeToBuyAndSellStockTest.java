package io.github.malast88.coding.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BestTimeToBuyAndSellStockTest {

  private static Stream<Arguments> getMaxProfitArgs() {
    return Stream.of(
        Arguments.of(new int[] {7, 2, 3, 10}, 8),
        Arguments.of(new int[] {7, 6, 5, 4}, 0),
        Arguments.of(new int[] {7, 5, 8, 4, 6, 5, 9}, 5));
  }

  @ParameterizedTest
  @MethodSource("getMaxProfitArgs")
  public void itShouldFindMaxProfit(int[] prices, int expected) {
    // arrange
    BestTimeToBuyAndSellStock sut = new BestTimeToBuyAndSellStock();

    // act
    int actual = sut.maxProfit(prices);

    // assert
    assertEquals(expected, actual);
  }
}

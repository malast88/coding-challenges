package io.github.malast88.coding.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStock2Test {

  private static Stream<Arguments> getMaxProfitArgs() {
    return Stream.of(
            Arguments.of(new int[] {7, 2, 3, 10}, 8),
            Arguments.of(new int[] {7, 6, 5, 4}, 0),
            Arguments.of(new int[] {7, 5, 8, 4, 6, 5, 9}, 9));
  }

  @ParameterizedTest
  @MethodSource("getMaxProfitArgs")
  public void itShouldFindMaxProfit(int[] prices, int expected) {
    // arrange
    BestTimeToBuyAndSellStock2 sut = new BestTimeToBuyAndSellStock2();

    // act
    int actual = sut.maxProfit(prices);

    // assert
    assertEquals(expected, actual);
  }
}

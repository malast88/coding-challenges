package io.github.malast88.coding.leetcode;

public class BestTimeToBuyAndSellStock2 {
  /**
   * Solution for Leetcode problem "Best Time to Buy and Sell Stock II"
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/ .
   *
   * @param prices array which contains prices of the stock over time
   * @return maximum profit which could make sequential transactions regarding to {@param prices}
   */
  /*
   * # Solution
   * The resulting value is the sum of differences between local minimums and next local maximums.
   *
   * _Complexity - O(n)
   *
   * _Space - O(1)_
   */
  public int maxProfit(int[] prices) {
    int sumIncreases = 0;
    int i = 0;
    while (i < prices.length - 1) {
      i = nextLocalMinimum(prices, i);
      int currentMinimum = prices[i];
      i = nextLocalMaximum(prices, i);
      sumIncreases += prices[i] - currentMinimum;
    }
    return sumIncreases;
  }

  private int nextLocalMinimum(int[] a, int currentIndex) {
    while (currentIndex < a.length - 1 && a[currentIndex] >= a[currentIndex + 1]) {
      currentIndex++;
    }
    return currentIndex;
  }

  private int nextLocalMaximum(int[] a, int currentIndex) {
    while (currentIndex < a.length - 1 && a[currentIndex] <= a[currentIndex + 1]) {
      currentIndex++;
    }
    return currentIndex;
  }
}

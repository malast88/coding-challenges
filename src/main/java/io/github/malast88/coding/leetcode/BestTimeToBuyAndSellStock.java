package io.github.malast88.coding.leetcode;

public class BestTimeToBuyAndSellStock {
  /**
   * Solution for Leetcode problem "Best Time to Buy and Sell Stock"
   * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ .
   *
   * @param prices array which contains prices of the stock over time
   * @return maximum profit which could make one buy-and-sell transaction regarding the {@param
   *     prices}
   */
  /*
   * # Solution
   * The resulting transaction should buy for the minimum possible price and sell for the next maximum price.
   * Iterate over the prices array keeping the minimum price over time updated.
   * For each element calculate the profit as a difference between minimum and current price.
   * If the current profit is greater then max profit update the maximum.
   *
   * _Complexity - O(n)
   *
   * _Space - O(1)_
   */
  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] - minPrice > maxProfit) {
        maxProfit = prices[i] - minPrice;
      }
      if (minPrice > prices[i]) {
        minPrice = prices[i];
      }
    }
    return maxProfit;
  }
}

package io.github.malast88.coding.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Solution for Leetcode problem "TwoSum" https://leetcode.com/problems/two-sum/ .
     *
     * @param nums array of integers
     * @param target target sum
     * @return indices of two numbers from {@param nums} which sum up to @param {@param target}
     */
    /*
    # Brute force solution
    Iterate over an array, for each element make an inner iteration.
    Check if two current elements from the outer and inner iteration sum up to the target.
    If yes, return indices of both iterations as an answer.

    _Complexity - O(n^2)_

    _Space - O(1)_

    # Solution
    Use a Hash Table, store elements as keys and indices as values.
    Iterate over an array, for each element subtract it from target.
    If Hash Table contains this difference as a key -  return the value for that key and the current index as an answer.
    Else, insert the current element and its index to the Hash Table, go to the next iteration.

    _Complexity - O(n)_

    _Space - O(n)_
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> ht = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (ht.containsKey(target - nums[i])) {
                return new int[]{ht.get(target - nums[i]), i};
            }
            ht.put(nums[i], i);
        }
        return null;
    }
}

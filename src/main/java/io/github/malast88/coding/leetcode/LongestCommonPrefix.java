package io.github.malast88.coding.leetcode;

public class LongestCommonPrefix {
    /**
     * Solution for Leetcode problem "Longest Common Prefix" https://leetcode.com/problems/longest-common-prefix/ .
     *
     * @param strs array of strings to find the longest common prefix in
     * @return longes common prefix of the array of strings {@param strs}
     */
    /*
    # Solution
    Start accumulating the result from the empty string.
    Iterate over the first string in the array.
    Compare each its character with the characters of the other strings in the array on the same position.
    If no difference on the current iteration, append the current character of the first string to the result.
    In case of any difference, return the result.

    _Complexity - O(n*m)_ where n==array size and m==maximum length of the string in the array

    _Space - O(1)_
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if (strs.length == 0 || strs[0].length() == 0) {
            return res.toString();
        }
        for (int currCharIndex=0;currCharIndex<strs[0].length();currCharIndex++) {
            char currChar = strs[0].charAt(currCharIndex);
            for (int currStrIndex=1;currStrIndex<strs.length;currStrIndex++) {
                if (currCharIndex >= strs[currStrIndex].length()
                        || currChar != strs[currStrIndex].charAt(currCharIndex)) {
                    return res.toString();
                }
            }
            res.append(currChar);
        }
        return res.toString();
    }
}

# coding-challenges
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/malast88/coding-challenges/CI)](https://github.com/malast88/coding-challenges/actions?query=workflow%3ACI)
[![Coverage](https://img.shields.io/codecov/c/github/malast88/coding-challenges.svg)](https://codecov.io/gh/malast88/coding-challenges)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=malast88_coding-challenges&metric=alert_status)](https://sonarcloud.io/dashboard?id=malast88_coding-challenges)

My solutions for coding challenges and puzzles.

## Algorithms
* [Array](https://github.com/malast88/coding-challenges#array)
* [Binary search](https://github.com/malast88/coding-challenges#binary-search)
* [Bitwise operations](https://github.com/malast88/coding-challenges#bitwise-operations)
* [Math](https://github.com/malast88/coding-challenges#math)
* [String searching](https://github.com/malast88/coding-challenges#string-searching)

## Data structures
* [Hash Table](https://github.com/malast88/coding-challenges#hash-table)
* [Linked List](https://github.com/malast88/coding-challenges#linked-list)
* [Binary Tree](https://github.com/malast88/coding-challenges#binary-tree)
* [Stack](https://github.com/malast88/coding-challenges#stack)

### Array

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0001 | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/TwoSum.java) | _O(n)_ | _O(n)_ | Easy | [Space-time tradeoff](https://en.wikipedia.org/wiki/Space%E2%80%93time_tradeoff). Brute force inner iteration solution requires _O(n^2)_ time and _O(1)_ space. |
| LC0014 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/LongestCommonPrefix.java) | _O(n*m)_ | _O(1)_ | Easy | No way to avoid potentially iterating over all characters of the all string. |
| LC0026 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/RemoveDuplicatesFromSortedArray.java) | _O(n)_ | _O(1)_ | Easy | Use two indices - one pointing to the end of the new array and another to iterate over the array. |
| LC0027 | [Remove Element](https://leetcode.com/problems/remove-element/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/RemoveElement.java) | _O(n)_ | _O(1)_ | Easy | Use two indices - one pointing to the end of the new array and another to iterate over the array. |
| LC0038 | [Count and Say](https://leetcode.com/problems/count-and-say/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/CountAndSay.java) | _O(2^n)_ | _O(2^n)_ | Easy | Use two pointers. |
| LC0053 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/MaximumSubarray.java) | _O(n)_ | _O(1)_ | Easy | Use [Kadane's algorithm](https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm)] (sequantally sum up elements of the array but throw the current sum and start from the current element if it is better to do it). |
| LC0058 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/LengthOfLastWord.java) | _O(n)_ | _O(1)_ | Easy | Iterate over the string from the end. |
| LC0066 | [Plus One](https://leetcode.com/problems/plus-one/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/PlusOne.java) | _O(n)_ | _O(n)_ | Easy | Iterate over the array from the end, mark overflow. |
| LC0067 | [Add Binary](https://leetcode.com/problems/add-binary/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/AddBinary.java) | _O(n)_ | _O(n)_ | Easy | Iterate over the array from the end, count overflow. |
| LC0088 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/MergeSortedArray.java) | _O(n)_ | _O(1)_ | Easy | Iterate over the arrays from the end, track destination position from the end |
| LC0118 | [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/PascalsTriangle.java) | _O(n^2)_ | _O(n^2)_ | Easy | |
| LC0119 | [Pascal's Triangle II](https://leetcode.com/problems/pascals-triangle-ii/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/PascalsTriangle2.java) | _O(n^2)_ | _O(n)_ | Easy | |
| LC0121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/BestTimeToBuyAndSellStock.java) | _O(n)_ | _O(1)_ | Easy | The resulting transaction should buy for the minimum possible price and sell for the next maximum price. |
| LC0122 | [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/BestTimeToBuyAndSellStock2.java) | _O(n)_ | _O(1)_ | Easy | The resulting value is the sum of differences between local minimums and next local maximums. |
| LC0125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/ValidPalindrome.java) | _O(n)_ | _O(1)_ | Easy | |

### Binary search

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0035 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/SearchInsertPosition.java) | _O(log(n))_ | _O(1)_ | Easy | Whatever position found by the binary search, the target is either bigger than the element on it, so next position, or less or equal, so the same position. |
| LC0069 | [Sqrt X](https://leetcode.com/problems/sqrtx/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/SqrtX.java) | _O(1)_ | _O(1)_ | Easy | |

### Bitwise operations

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0136 | [Single Number](https://leetcode.com/problems/single-number/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/SingleNumber.java) | _O(n)_ | _O(1)_ | Easy | Apply XOR operation to all elements of the array. |

### Math

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0007 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/ReverseInteger.java) | _O(1)_ | _O(1)_ | Easy | There is overflow after multiplication of the number by 10, if the result of the multiplication, divided by 10, does not equal to this number. |
| LC0009 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/PalindromeNumber.java) | _O(1)_ | _O(1)_ | Easy | Reverse the number and compare with itself. Overflow check is the same a in the "Reverse Integer" problem. |
| LC0013 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/RomanToInteger.java) | _O(n)_ | _O(1)_ | Easy | Save the previous value so no need to look forward when iterating the string. |
| LC0070 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/ClimbingStairs.java) | _O(n)_ | _O(1)_ | Easy | Fibonacci sequence. |

### String searching

There are many [String searching algorithms](https://en.wikipedia.org/wiki/String-searching_algorithm).

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0028 | [Implement strStr()](https://leetcode.com/problems/implement-strstr/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/ImplementStrStr.java) | _O(n*m)_ | _O(1)_ | Easy | Naive string-search algorithm. For each position where needle fits into haystack, check if needle is a substring of haystack at that position. |

### Hash Table

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0001 | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/TwoSum.java) | _O(n)_ | _O(n)_ | Easy | [Space-time tradeoff](https://en.wikipedia.org/wiki/Space%E2%80%93time_tradeoff). Brute force inner iteration solution requires _O(n^2)_ time and _O(1)_ space. |

### Linked List

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0021 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/MergeTwoSortedLists.java) | _O(n)_ | _O(1)_ | Easy | Compose the result iteratively from the first node with the lower value from both lists. |
| LC0083 | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/RemoveDuplicatesFromSortedList.java) | _O(n)_ | _O(1)_ | Easy | |

### Binary Tree

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0100 | [Same Tree](https://leetcode.com/problems/same-tree/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/SameTree.java) | _O(n)_ | _O(log(n))_ | Easy | |
| LC0101 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/SymmetricTree.java) | _O(n)_ | _O(log(n))_ | Easy | |
| LC0107 | [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/BinaryTreeLevelOrderTraversal2.java) | _O(n)_ | _O(n)_ | Easy | |
| LC0108 | [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/ConvertSortedArrayToBinarySearchTree.java) | _O(log(n))_ | _O(n)_ | Easy | |
| LC0110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/BalancedBinaryTree.java) | _O(n)_ | _O(log(n))_ | Easy | |
| LC0111 | [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/MinimumDepthOfBinaryTree.java) | _O(n)_ | _O(log(n))_ | Easy | |
| LC0112 | [Path Sum](https://leetcode.com/problems/path-sum/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/PathSum.java) | _O(n)_ | _O(log(n))_ | Easy | |

### Stack

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0020 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/ValidParentheses.java) | _O(n)_ | _O(n)_ | Easy | Sonar recognizes direct usage of Stack class as a performance issue in the code and recommends to use Deque instead |


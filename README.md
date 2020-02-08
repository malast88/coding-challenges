# coding-challenges
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/malast88/coding-challenges/CI)](https://github.com/malast88/coding-challenges/actions?query=workflow%3ACI)
[![Coverage](https://img.shields.io/codecov/c/github/malast88/coding-challenges.svg)](https://codecov.io/gh/malast88/coding-challenges)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=malast88_coding-challenges&metric=alert_status)](https://sonarcloud.io/dashboard?id=malast88_coding-challenges)

My solutions for coding challenges and puzzles.

## Algorithms
* [Array](https://github.com/malast88/coding-challenges#array)
* [Math](https://github.com/malast88/coding-challenges#math)

## Data structures
* [Hash Table](https://github.com/malast88/coding-challenges#hash-table)
* [Linked List](https://github.com/malast88/coding-challenges#linked-list)
* [Stack](https://github.com/malast88/coding-challenges#stack)

### Array

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0001 | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/TwoSum.java) | _O(n)_ | _O(n)_ | Easy | [Space-time tradeoff](https://en.wikipedia.org/wiki/Space%E2%80%93time_tradeoff). Brute force inner iteration solution requires _O(n^2)_ time and _O(1)_ space. |
| LC0014 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/LongestCommonPrefix.java) | _O(n*m)_ | _O(1)_ | Easy | No way to avoid potentially iterating over all characters of the all string. |
| LC0026 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/RemoveDuplicatesFromSortedArray.java) | _O(n)_ | _O(1)_ | Easy | Use two indices - one pointing to the end of the new array and another to iterate over the array. |
| LC0027 | [Remove Element](https://leetcode.com/problems/remove-element/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/RemoveElement.java) | _O(n)_ | _O(1)_ | Easy | Use two indices - one pointing to the end of the new array and another to iterate over the array. |

### Math

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0007 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/ReverseInteger.java) | _O(1)_ | _O(1)_ | Easy | There is overflow after multiplication of the number by 10, if the result of the multiplication, divided by 10, does not equal to this number. |
| LC0009 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/PalindromeNumber.java) | _O(1)_ | _O(1)_ | Easy | Reverse the number and compare with itself. Overflow check is the same a in the "Reverse Integer" problem. |
| LC0013 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/RomanToInteger.java) | _O(N)_ | _O(1)_ | Easy | Save the previous value so no need to look forward when iterating the string. |

### Hash Table

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0001 | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/TwoSum.java) | _O(n)_ | _O(n)_ | Easy | [Space-time tradeoff](https://en.wikipedia.org/wiki/Space%E2%80%93time_tradeoff). Brute force inner iteration solution requires _O(n^2)_ time and _O(1)_ space. |

### Linked List

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0021 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/MergeTwoSortedLists.java) | _O(n)_ | _O(1)_ | Easy | Compose the result iteratively from the first node with the lower value from both lists. |

### Stack

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0020 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/ValidParentheses.java) | _O(n)_ | _O(n)_ | Easy | Sonar recognizes direct usage of Stack class as a performance issue in the code and recommends to use Deque instead |


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

### Array

|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note | 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- | ---- |
| LC0001 | [Two Sum](https://leetcode.com/problems/two-sum/) | [Java](./src/main/java/io/github/malast88/coding/leetcode/TwoSum.java) | _O(n)_ | _O(n)_ | Easy | [Space-time tradeoff](https://en.wikipedia.org/wiki/Space%E2%80%93time_tradeoff). Brute force inner iteration solution requires _O(n^2)_ time and _O(1)_ space. |

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

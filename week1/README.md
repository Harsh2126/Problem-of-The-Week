# Week 1 - Problem of The Week

This folder contains solutions to algorithmic problems for Week 1. Each file includes a brief explanation of the problem and the approach used to solve it.

## 1. PaintHouseII.java
**Problem:**
Given a row of `n` houses, each can be painted with one of `k` colors. The cost of painting each house with a certain color is provided. No two adjacent houses can have the same color. Find the minimum cost to paint all houses.

**Approach:**
- Uses dynamic programming to keep track of the minimum and second minimum costs for each house.
- For each house, the cost of painting it with a color is updated based on the minimum cost of painting the previous house with a different color.
- Efficiently finds the minimum cost in O(nk) time.

**Time Complexity:** O(nk)
**Space Complexity:** O(1) (modifies the input array in place, uses only a constant amount of extra space)

## 2. findMinRotated.java
**Problem:**
Given a rotated sorted array, find the minimum element. The array does not contain duplicates.

**Approach:**
- Uses binary search to efficiently find the minimum element in O(log n) time.
- Checks the middle element and determines which half of the array to search next based on the sorted property.

**Time Complexity:** O(log n)
**Space Complexity:** O(1)

## 3. subarrySumEqualsToK.java
**Problem:**
Given an array of integers and an integer `k`, find the total number of continuous subarrays whose sum equals to `k`.

**Approach:**
- Uses a HashMap to store the cumulative sum and its frequency.
- For each element, checks if there is a previous cumulative sum that, when subtracted from the current sum, equals `k`.
- Achieves O(n) time complexity.

**Time Complexity:** O(n)
**Space Complexity:** O(n) (for the HashMap storing prefix sums)

---

**Note:** This README documents all files in the `week1` directory. The order of files in your file explorer may vary, but you can always refer to this README for explanations of each code file. 
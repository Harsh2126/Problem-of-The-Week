# Week 3 Problem Solutions

## 1. Count Univalue Subtrees
**Approach**: 
- Recursively check if all nodes in a subtree have the same value
- Use a helper function that returns whether a subtree is univalue and increments a count when true

**Time Complexity**: O(n) where n is number of nodes (visits each node once)
**Space Complexity**: O(h) where h is height of tree (recursion stack)

## 2. Equal Sum Partition
**Approach**:
- First check if total sum is even (odd sums can't be partitioned)
- Use dynamic programming to determine if subset sum equals half of total sum

**Time Complexity**: O(n*s) where n is array length and s is half of total sum
**Space Complexity**: O(s) for the DP array

## 3. Search in 2D Matrix
**Approach**:
- Treat the 2D matrix as a flattened sorted array
- Perform binary search by calculating row/col indices from the flattened index

**Time Complexity**: O(log(mn)) where m is rows and n is columns
**Space Complexity**: O(1) (constant extra space)
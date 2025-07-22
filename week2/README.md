# Week 2 Problem Solutions

## 1. Valid Anagrams
**Approach:** 
- Compare string lengths first
- Use a count array of size 26 (for English alphabet)
- Increment counts for characters in first string
- Decrement counts for characters in second string
- Check if all counts are zero

**Time Complexity:** O(n) where n is length of strings
**Space Complexity:** O(1) (fixed size count array)

## 2. Longest Common Subsequence
**Approach:**
- Dynamic programming solution
- Create 2D DP table where dp[i][j] represents LCS of first i chars of text1 and first j chars of text2
- Fill table by comparing characters and building solution from subproblems

**Time Complexity:** O(m*n) where m and n are lengths of input strings
**Space Complexity:** O(m*n) for DP table

## 3. Partition Equal Subset Sum
**Approach:**
- First check if total sum is even
- Use dynamic programming to find subset that sums to half of total sum
- DP table tracks whether sum j can be achieved with first i elements

**Time Complexity:** O(n*s) where n is array length and s is half of total sum
**Space Complexity:** O(n*s) for DP table
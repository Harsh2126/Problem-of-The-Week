# Maximum Path Sum in Binary Tree

## Problem Statement
Given a non-empty binary tree, find the maximum path sum. A path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path does not need to pass through the root.

## Approaches

- **Depth-First Search (DFS) / Recursion**: The problem can be solved using a recursive DFS approach. For each node, we calculate the maximum path sum that can be formed by including the node itself and paths from its left and right children. We also need to keep track of a global maximum path sum, as the maximum path might not necessarily pass through the root or the current node as its highest point.

## Time Complexity

- **O(N)**: Where N is the number of nodes in the binary tree. We visit each node exactly once during the DFS traversal.

## Space Complexity

- **O(H)**: Where H is the height of the binary tree. This space is used by the recursion stack during the DFS traversal. In the worst case (skewed tree), H can be N, leading to O(N) space complexity. In the best case (balanced tree), H is log N, leading to O(log N) space complexity.

---

# Nim (Misère Version) Problem

## Problem Statement
The game of Nim is played on several heaps of stones. Two players alternate turns. On a turn, a player removes one or more stones from exactly one heap. In this variant, the player who takes the last stone loses (this is called misère Nim).

Given three non-zero starting heap sizes `[a, b, c]` (each > 0), decide whether the first player (the player who moves first) has a forced win assuming both players play optimally.

## Approach: Misère Nim Strategy

Misère Nim has a slightly different winning strategy compared to normal play Nim. The key is to determine if the game is in a "normal play" state or a "misère play" state.

**Normal Play Nim**: The player who takes the last stone wins. The winning strategy is based on the Nim-sum (XOR sum) of the heap sizes. If the Nim-sum is non-zero, the current player has a winning strategy. If it's zero, the current player will lose if the opponent plays optimally.

**Misère Play Nim**: The player who takes the last stone loses. The winning strategy is as follows:
1.  If the game is in a state where **all heaps are of size 1**, the first player wins if and only if the number of heaps is **even**. This is because the first player can always leave an odd number of heaps for the opponent, forcing the opponent to take the last stone.
2.  If the game is in a state where **at least one heap is greater than 1**, the game behaves like normal play Nim. In this scenario, the first player wins if and only if the Nim-sum (XOR sum) of all heaps is **non-zero**.

### Algorithm Steps:
1.  Calculate the XOR sum of all heap sizes.
2.  Count the number of heaps with size 1.
3.  **Case 1: All heaps are of size 1.**
    If the count of heaps with size 1 is equal to the total number of heaps, then the first player wins if the total number of heaps is even.
4.  **Case 2: At least one heap is greater than 1.**
    If there is at least one heap with size greater than 1, then the first player wins if the XOR sum of all heaps is non-zero.

## Complexity Analysis

### Time Complexity

The time complexity is \(O(N)\), where \(N\) is the number of heaps. This is because we iterate through the heaps once to calculate the XOR sum and count heaps of size 1.

### Space Complexity

The space complexity is \(O(1)\) as we only use a few constant extra variables to store the XOR sum and the count of heaps of size 1.

---

# Minimum Number of Perfect Squares to Sum to N

## Problem Statement
Given a positive integer `n`, find the least number of perfect square numbers (for example, `1, 4, 9, 16, ...`) which sum to `n`.

## Approach: Dynamic Programming

This problem can be efficiently solved using dynamic programming. We can define `dp[i]` as the least number of perfect square numbers that sum to `i`. The base case is `dp[0] = 0`.

For any `i > 0`, `dp[i]` can be calculated by considering all perfect squares `j*j` less than or equal to `i`. The recurrence relation would be:
`dp[i] = min(dp[i], dp[i - j*j] + 1)` for all `j*j <= i`.

We initialize `dp` array with a large value (e.g., `Integer.MAX_VALUE`) and `dp[0]` to `0`.

### Algorithm Steps:
1.  Create a `dp` array of size `n + 1` and initialize all elements to `Integer.MAX_VALUE`.
2.  Set `dp[0] = 0`.
3.  Iterate `i` from `1` to `n`:
    a.  For each `i`, iterate `j` from `1` such that `j*j <= i`.
    b.  Update `dp[i] = Math.min(dp[i], dp[i - j*j] + 1)`.
4.  Return `dp[n]`.

## Complexity Analysis

### Time Complexity

The time complexity is \(O(N * \sqrt{N})\). The outer loop runs `N` times (from 1 to `n`), and the inner loop runs approximately `\sqrt{N}` times (from 1 to `\sqrt{i}`).

### Space Complexity

The space complexity is \(O(N)\) for the `dp` array.
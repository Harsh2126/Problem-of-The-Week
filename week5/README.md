# Week 5 Problems

## 1. Deep Clone Linked List with Random Pointer

### Problem Description
Given a linked list where each node has two pointers, `next` and `random`. The `random` pointer could point to any node in the list or `null`. The task is to create a deep copy of the list.

### Approach
The problem is solved using a three-pass approach:
1.  **Create and Interweave Copies:** Iterate through the original list. For each original node, create a new copy node and insert it immediately after the original node. So, if the original list was `A -> B -> C`, it becomes `A -> A' -> B -> B' -> C -> C'`.
2.  **Assign Random Pointers for Copies:** Iterate through the modified list. For each original node `curr`, its random pointer `curr.random` points to some node `X`. The copy node `curr.next` should have its random pointer point to `X.next` (which is `X'` in the interweaved list). If `curr.random` is `null`, then `curr.next.random` is also `null`.
3.  **Separate Original and Copy Lists:** Iterate through the interweaved list and separate it into two distinct lists: the original list and the deep copy. This involves adjusting the `next` pointers of both the original and copy nodes.

### Time Complexity
O(N) - where N is the number of nodes in the linked list. We iterate through the list a constant number of times (three passes).

### Space Complexity
O(1) - We are not using any extra space proportional to the input size, only a few pointers for traversal and temporary storage.

## 2. Flood Fill Algorithm

### Problem Description
Given an `m x n` integer `image` representing the grayscale value of each pixel, and two integers `sr` and `sc` representing the starting row and column of the flood fill. Also given an integer `newColor`. Perform a flood fill on the image starting from `image[sr][sc]` with the `newColor`.

### Approach
The flood fill algorithm is implemented using a recursive Depth-First Search (DFS) approach:
1.  **Initial Check:** Get the `originalColor` of the starting pixel `image[sr][sc]`. If `originalColor` is already equal to `newColor`, there's nothing to do, so return the image as is.
2.  **DFS Function:** A helper `dfs` function is called with the image, current row `r`, current column `c`, `originalColor`, and `newColor`.
    *   **Base Cases:** The `dfs` function stops if:
        *   The current coordinates `(r, c)` are out of the image boundaries.
        *   The color of the current pixel `image[r][c]` is not the `originalColor` (meaning it's already been visited or is a different color boundary).
    *   **Recursive Step:** If the base cases are not met:
        *   Change the color of the current pixel `image[r][c]` to `newColor`.
        *   Recursively call `dfs` for all four adjacent neighbors (up, down, left, right).

### Time Complexity
O(M*N) - where M is the number of rows and N is the number of columns in the image. In the worst case, the DFS might visit every pixel in the image if they are all connected and have the same `originalColor`.

### Space Complexity
O(M*N) - In the worst case, the recursion stack depth can be M*N if the entire image is filled and the DFS explores a long path (e.g., a snake-like path through the grid). This space is used for the call stack.

## 3. Greatest Common Divisor (GCD)

### Problem Description
Given two non-negative integers, find their greatest common divisor (GCD). The GCD of two integers is the largest positive integer that divides both numbers without leaving a remainder.

### Approach
The problem is solved using the Euclidean algorithm, which is an efficient method for computing the GCD of two integers. The algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number. This process is repeated until one of the numbers becomes zero, and the other number is the GCD. A more optimized version uses the modulo operator.

**Recursive Euclidean Algorithm:**
1.  **Base Case:** If the second number (`b`) is 0, then the GCD is the first number (`a`).
2.  **Recursive Step:** Otherwise, the GCD of `a` and `b` is the same as the GCD of `b` and the remainder of `a` divided by `b` (`a % b`). This can be expressed as `GCD(a, b) = GCD(b, a % b)`.

### Time Complexity
O(log(min(a, b))) - The number of steps in the Euclidean algorithm is logarithmic with respect to the smaller of the two numbers. This is because the remainder `a % b` is always less than `b`, and the numbers decrease rapidly.

### Space Complexity
O(log(min(a, b))) - Due to the recursive calls, the space complexity is proportional to the depth of the recursion stack, which is also logarithmic with respect to the smaller of the two numbers. For an iterative implementation, the space complexity would be O(1).

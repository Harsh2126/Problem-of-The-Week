# Approaches

- **firstrecurring.java**: This file likely contains a solution to find the first recurring character in a string or array.
- **countfrindgroupproblem.java**: This file probably addresses a problem related to counting friend groups or similar graph-based social network problems.
- **serachinsortedarray.java**: This file is expected to have a solution for searching an element in a sorted array, possibly with rotations.

# Time Complexity

- **firstrecurring.java**: Typically O(N) using a hash set, where N is the length of the input.
- **countfrindgroupproblem.java**: Depends on the approach, often O(V+E) for graph traversal (DFS/BFS) or O(N^2) for Disjoint Set Union, where V is vertices and E is edges.
- **serachinsortedarray.java**: O(log N) using binary search, where N is the number of elements in the array.

# Space Complexity

- **firstrecurring.java**: O(N) for the hash set in the worst case, where N is the number of unique characters.
- **countfrindgroupproblem.java**: O(V) for visited arrays or parent arrays in DSU, where V is the number of vertices.
- **serachinsortedarray.java**: O(1) as it typically uses a constant amount of extra space.
class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively get the maximum path sum from the left and right children
        // We take max(0, ...) because we don't want to include negative paths
        int leftPathSum = Math.max(0, dfs(node.left));
        int rightPathSum = Math.max(0, dfs(node.right));

        // Calculate the path sum through the current node
        // This path includes the current node's value + max path from left + max path from right
        int currentPathSum = node.val + leftPathSum + rightPathSum;

        // Update the global maximum path sum if the current path is greater
        maxSum = Math.max(maxSum, currentPathSum);

        // Return the maximum path sum that can be extended upwards from the current node
        // This is the current node's value + the maximum of left or right path
        return node.val + Math.max(leftPathSum, rightPathSum);
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
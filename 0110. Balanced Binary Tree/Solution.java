/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root).balanced;
    }

    private BalancedStatusWithHeight checkBalanced(TreeNode root) {

        // base condition
        if (root == null) {
            return new BalancedStatusWithHeight(true, -1);
        }

        BalancedStatusWithHeight leftResult = checkBalanced(root.left);
        if (!leftResult.balanced) {
            return leftResult;
        }

        BalancedStatusWithHeight rightResult = checkBalanced(root.right);
        if (!rightResult.balanced) {
            return rightResult;
        }

        boolean isBalanced = Math.abs(leftResult.height - rightResult.height) <= 1;
        int height = Math.max(leftResult.height, rightResult.height) + 1;
        return new BalancedStatusWithHeight(isBalanced, height);
    }
}

class BalancedStatusWithHeight {
    public boolean balanced;
    public int height;
    public BalancedStatusWithHeight(boolean balanced, int height) {
        this.balanced = balanced;
        this.height = height;
    }
}

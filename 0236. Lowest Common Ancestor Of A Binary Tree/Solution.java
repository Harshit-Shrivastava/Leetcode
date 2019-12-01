/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    private TreeNode ans;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //traverse the tree
        this.recurseTree(root, p, q);
        return this.ans;
    }
    
    public Solution() {
        this.ans = null;
    }
    
    private boolean recurseTree(TreeNode curNode, TreeNode p, TreeNode q) {
        //if reached end of branch, return false
        if (curNode == null) {
            return false;
        }
        
        //left recursion. If left recursion is true, set left to 1, else 0
        int left = this.recurseTree(curNode.left, p, q) ? 1 : 0;
        
        //right recursion. If right recursion returns true, set right to 1, else 0
        int right = this.recurseTree(curNode.right, p, q) ? 1 : 0;
        
        //if the current node is one of p or q
        int mid = (curNode == p || curNode == q) ? 1 : 0;
        
        //if any two of the flags, left, right, or mid, become true
        if(mid + left + right >= 2) {
            this.ans = curNode;
        }
        
        //return true if any of the three bool values is true
        return (left + right + mid > 0);
    }
}
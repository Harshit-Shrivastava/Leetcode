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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return createTree(nums, 0, nums.length);
    }
    
    public TreeNode createTree(int[] arr, int left, int right){
        if(left == right){
            return null;
        }
        int max = findMax(arr, left, right);
        TreeNode root = new TreeNode(arr[max]);
        root.left = createTree(arr, left, max);
        root.right = createTree(arr, max +1, right);
        return root;
    }
    
    public int findMax(int[] arr, int left, int right){
        int max = left;
        for(int i = left; i < right; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
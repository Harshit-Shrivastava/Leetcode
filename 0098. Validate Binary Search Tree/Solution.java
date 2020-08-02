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
    public boolean isValidBST(TreeNode root) {
        List<Integer> elements = new ArrayList<>();
        inorder(root, elements);

        for (int i = 0; i < elements.size() - 1; i++) {
            if (elements.get(i) >= elements.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private void inorder(TreeNode root, List<Integer> elements) {
        if (root == null) {
            return;
        }

        inorder(root.left, elements);
        elements.add(root.val);
        inorder(root.right, elements);
    }
}

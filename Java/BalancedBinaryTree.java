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
    boolean height = true;
    public boolean isBalanced(TreeNode root) {
        int c = checkBalance(root);
        return height;
    }

    public int checkBalance(TreeNode node) {
        if(node == null) return 0;
        int left = checkBalance(node.left);
        int right = checkBalance(node.right);
        height = height && Math.abs(left - right) < 2;
        return Math.max(left, right)+1;
    }
}

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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       int c = checkDiameter(root);
       return max;
    }
    public int checkDiameter(TreeNode node) {
        if (node == null) return -1;
        int left = checkDiameter(node.left)+1;
        int right = checkDiameter(node.right)+1;
        max = Math.max(left+right , max);
        return Math.max(left, right);
    }
}

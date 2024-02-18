/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }g
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     
 * }
 */
class Solution {
     List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       
        traversal(root);
        return list;
    }

    public void traversal(TreeNode node ) {
        if (node == null) return;
        traversal(node.left);
        list.add(node.val);
        traversal(node.right);
    }
}

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
    public String tree2str(TreeNode root) {
        StringBuilder str = new StringBuilder();
        constructStr(root, str);
        return str.toString();
    }
     public StringBuilder constructStr(TreeNode root, StringBuilder str) {
         str.append(root.val);
         if(root.left == null && root.right == null) return str;
             str.append('(');
            if(root.left != null) { constructStr(root.left, str); }
             str.append(')');
         
         if (root.right != null) {
             str.append('(');
             constructStr(root.right, str);
             str.append(')');
         }
         return str;
     }
}

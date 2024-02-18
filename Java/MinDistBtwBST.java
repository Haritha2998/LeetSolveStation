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
    
    public int minDiffInBST(TreeNode root) {
       List<Integer> list = new ArrayList<>();
       calculateList(root, list);
       int min = Integer.MAX_VALUE;
        for(int i = 0; i< list.size()-1; i++) {
           min = Math.min(min, Math.abs(list.get(i+1) - list.get(i)));
        }
        return min;
    }
    public void calculateList(TreeNode root, List<Integer> list) {
        if(root == null) return ;
        calculateList(root.left, list);
        list.add(root.val);
        calculateList(root.right, list);
    }
}

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
    int sum;
    public int maxPathSum(TreeNode root) {
        sum = Integer.MIN_VALUE;
        findSum(root);
        return sum;
    }
    public int findSum(TreeNode root){
        if(root==null) return 0;
        int left = Math.max(0,findSum(root.left));
        int right = Math.max(0,findSum(root.right));
        sum = Math.max(sum, left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
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
        return validTree(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean validTree(TreeNode root,long low, long high){
        if(root==null){
            return true;
        }
        if(root.val<=low || root.val>=high){
            return false;
        }
        return validTree(root.left,low,root.val) && validTree(root.right,root.val,high);
    }
}
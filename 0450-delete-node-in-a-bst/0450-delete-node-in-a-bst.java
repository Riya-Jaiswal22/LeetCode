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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root!=null && root.val==key){
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left!=null && root.right==null){
                return root.left;
            }
            else if(root.left==null && root.right!=null){
                return root.right;
            }
            else{
                int succ = inorderSuccessor(root);
                root.val = succ;
                root.right = deleteNode(root.right,succ);
            }
        }
        else if(root!=null && root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else if(root!=null && root.val>key){
            root.left = deleteNode(root.left,key);
        }
        return root;
    }
    public int inorderSuccessor(TreeNode root){
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }
}
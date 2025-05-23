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
    ArrayList<Integer> al = new ArrayList<>();
    int i=0;
    public void recoverTree(TreeNode root) {
        inorder(root);
        Collections.sort(al);
        recover(root);
    }
    public void recover(TreeNode root){
        if(root==null) return;
        recover(root.left);
        if(root.val!=al.get(i)){
            root.val = al.get(i);
        }
        i++;
        recover(root.right);
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
}
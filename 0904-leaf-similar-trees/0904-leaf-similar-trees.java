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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar1 = leafNodes(root1,ar1);
        ar2 = leafNodes(root2,ar2);
        if(ar1.equals(ar2)){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Integer> leafNodes(TreeNode root, ArrayList<Integer> ar){
        if(root==null) return ar;
        if(root.left==null && root.right==null) ar.add(root.val);
        leafNodes(root.left,ar);
        leafNodes(root.right,ar);
        return ar;
    }
}
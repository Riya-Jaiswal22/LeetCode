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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null) return res;
        TreeNode t;
        int i;
        q.add(root);
        while(!q.isEmpty()){
            int l = q.size();
            i=0;
            while(i<l){
                t = q.poll();
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
                i++;
                if(i==l){
                    res.add(t.val);
                }
            }
        }
        return res;
    }
}
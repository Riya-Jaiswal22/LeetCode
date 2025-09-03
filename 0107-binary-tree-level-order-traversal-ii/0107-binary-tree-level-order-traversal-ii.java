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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        TreeNode t;
        int i;
        q.add(root);
        while(!q.isEmpty()){
            int l = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(i=0;i<l;i++){
                t = q.poll();
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
                temp.add(t.val);
            }
            res.add(temp);
        }
        Collections.reverse(res);
        return res;
    }
}
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
    private void invert(TreeNode root){
        if(root==null) return ;

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);

    }
    private boolean same(TreeNode q,TreeNode p){
        if(q==null && p==null) return true;
        if (q == null || p == null) return false;
        if(q.val!=p.val) return false;
        if(same(q.left,p.left)==false) return false;
        if(same(q.right,p.right)==false) return false;
        return true;


    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode left=root.left;
        TreeNode right=root.right;
        invert(right);
        return same(left,right);    
    }
}

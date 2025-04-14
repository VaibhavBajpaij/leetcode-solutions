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
    private int  level(TreeNode root,int level){
        if(root==null) return 0 ;
        return 1+Math.max(level(root.left,level+1),level(root.right,level+1));
    }
    public int maxDepth(TreeNode root) {

        return level(root,0);
        
    }
}

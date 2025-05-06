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
    private int height(TreeNode root,int sum){
        if(root==null) return 0;

        if(root.left!=null)  height(root.left,sum+1);
         if(root.right!=null) height(root.right,sum+1);
         return sum;

        
    }
    public int minDepth(TreeNode root) {
         if(root==null) return 0;
        if(root.left!=null &&root.right==null ) return minDepth(root.left)+1;
         if(root.right!=null && root.left==null) return minDepth(root.right)+1;

         return Math.min(minDepth(root.left),minDepth(root.right))+1;
        
    }
}

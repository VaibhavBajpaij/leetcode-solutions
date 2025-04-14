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
    private  int  level(TreeNode root,boolean[] arr){
        if(root==null) return 0;

        int left=level(root.left,arr);
        int right=level(root.right,arr);
        int deff=Math.abs(left-right);
        if(deff>1) arr[0]=false;
        return 1+Math.max(left,right);

    }
    public boolean isBalanced(TreeNode root) {
        boolean [] arr={true};
        level(root,arr);
        return arr[0];
        
    }
}

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
    private void count(TreeNode root,int[] arr){
        if(root==null) return ;
        
        count(root.left,arr);
        arr[0]=arr[0]+1;
        count(root.right,arr);
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int [] arr={0};
        count(root,arr);
        return arr[0];


        
    }
}

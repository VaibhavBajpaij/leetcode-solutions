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
    private int checksum(TreeNode root ,int sum){
        if(root ==null) return 0;

        sum+=root.val;
        if(root.left==null && root.right==null){
            return sum;
        }

        return checksum(root.left,sum) +checksum(root.right,sum);

    }
    public boolean checkTree(TreeNode root) {

        if(root==null) return true;

        int sumleft=checksum(root.left,0);
        int sumright=checksum(root.right,0);
        int total=sumleft+sumright;

        if(total!=root.val){
            return false;
        }
        checkTree(root.left);
        checkTree(root.right);
        
        return true;

        
    }
}

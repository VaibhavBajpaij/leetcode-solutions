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
     public static void helper(TreeNode root,ArrayList<Integer> ans){
        if (root == null) return;

        // Print current node's value
      

        helper(root.left,ans);
         ans.add(root.val);
        helper(root.right,ans);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
        
    }
}

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
    private void pathsum(TreeNode root,int targetSum,int v,HashSet<Integer> set){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            v=v+root.val;
            // if(v==targetSum){
            //     return true;
            // }
            set.add(v);

        }
        pathsum(root.left,targetSum,v+root.val,set);
        pathsum(root.right,targetSum,v+root.val,set);

      
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // HashSet<Integer> set=new HashSet<>();
        // pathsum(root,targetSum,0,set);
        // return set.contains(targetSum);
         if (root == null) {
        return false;
    }

    // If it's a leaf node, check if the path sum matches
    if (root.left == null && root.right == null) {
        return targetSum == root.val;
    }

    // Recursively check left and right subtrees with updated targetSum
    return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
          

        // return false;
        
    }
}

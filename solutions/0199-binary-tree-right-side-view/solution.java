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
    private int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    private void dfs(TreeNode root,int level,List<Integer> ans){
        if(root==null) return ;
        ans.set(level,root.val);
        dfs(root.left,level+1,ans);
        dfs(root.right,level+1,ans);

        
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;

        int lev=level(root);
        for(int i=0;i<lev;i++){
            ans.add(0);
        }
        dfs(root,0,ans);
        return ans;
        
    }
}

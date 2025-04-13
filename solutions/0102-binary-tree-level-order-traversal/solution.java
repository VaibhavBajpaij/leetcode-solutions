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
    private List<Integer> nthlevel(TreeNode root,int level,int curr,List<Integer> list){
        
         if(root==null) return list;
         if(curr>level) return list;
         if(curr==level){
            list.add(root.val);
         }
         nthlevel(root.left,level,curr+1,list);
         nthlevel(root.right,level,curr+1,list);
         return  list;

    }
    public List<List<Integer>> levelOrder(TreeNode root) {

        int level=level(root);
        
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<level;i++){
            List<Integer> list=new ArrayList<>();
            nthlevel(root,i,0,list);
            ans.add(list);

        }
        return ans;
        
    }
}

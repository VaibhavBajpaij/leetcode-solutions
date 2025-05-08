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
    public int findBottomLeftValue(TreeNode root) {
         
        if(root==null) return -1;
        Queue<TreeNode> q=new LinkedList<>();
        int leftnode=root.val;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            leftnode=q.peek().val;

            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                 
                
                    if(temp.left!=null) q.add(temp.left);
                    
                    
                     if(temp.right!=null) q.add(temp.right);
                     
                
                 
            }
        }

        return leftnode;
        
    }
}

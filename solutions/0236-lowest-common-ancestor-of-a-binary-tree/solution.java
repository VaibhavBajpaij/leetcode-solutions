/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean exist(TreeNode root,TreeNode node){
         if(root==null) return false;
        if(root.val==node.val) return true;
        
       

        return exist(root.left,node) || exist(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

         if (root == null || root == p || root == q) return root;
        boolean pleft=exist(root.left,p);
        boolean qleft=exist(root.left,q);

        if(pleft==true&& qleft==true) return lowestCommonAncestor( root.left, p,  q);
        if(pleft==false&& qleft==false) return lowestCommonAncestor( root.right, p,  q);
        else{
            return root;
        }
        
        
    }
}

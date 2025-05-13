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
     private TreeNode parent(TreeNode root, TreeNode pred){
        if(pred ==null ) return null;
        if(root.left==pred || root.right==pred ) return root;
        TreeNode temp=root.left;
        while(temp.right!=pred) temp=temp.right;
        return temp;
    }
    private TreeNode pres(TreeNode root){
        if(root==null) return null;
       TreeNode temp=root.left;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp;
        
    }

    public TreeNode deleteNode(TreeNode root, int key) {
         
   
   
   
        if(root==null) return null;
        
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        if(key==root.val){
            
            // case 1: if it is left Node
            if(root.left==null && root.right==null){
                return null;
            }
            // case 2: when one left
            if(root.left==null || root.right==null){
                if(root.left==null) return root.right;
                if(root.right==null) return root.left;
            }
            // when have 2 lefe node
            else{
                TreeNode p=pres(root);
                TreeNode pp=parent(root,p);
                
                if(root==pp){
                   p.right=root.right;
                   return p;
                }
                pp.right=p.left;
                p.left=root.left;
                p.right=root.right;
                return p;
            }
        }
        return root;
    }
    
    
        
    }


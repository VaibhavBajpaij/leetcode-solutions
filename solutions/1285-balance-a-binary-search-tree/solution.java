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
    private void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return ;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    private TreeNode balanceBinaryTree(ArrayList<Integer> arr,int lo,int hi){
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=balanceBinaryTree(arr,lo,mid-1);
        root.right=balanceBinaryTree(arr,mid+1,hi);
        return root;

    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
      return  balanceBinaryTree(arr,0,arr.size()-1);



        
        
    }
}

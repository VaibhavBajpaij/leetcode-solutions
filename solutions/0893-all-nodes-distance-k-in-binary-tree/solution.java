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
    //case1 subtree
    private void subset(TreeNode root,int k,List<Integer> ans){
        
        if(root==null) return ;
        if(k==0){
            ans.add(root.val);
        }
            subset(root.left,k-1,ans);
            subset(root.right,k-1,ans);

    }
     private int  ansester(TreeNode root, TreeNode target, int k, List<Integer> ans) {
        
        

        if(root==null) return -1;
        if(k==-1) return -1;
        if(target.val==root.val){
            subset(root,k,ans);
            return 0;

        }
        int leftroot=ansester(root.left,target,k,ans);
        if(leftroot!=-1){
            if(leftroot+1==k){
                ans.add(root.val);
            }else{
                subset(root.right,k-leftroot-2, ans);
                
            }
            return leftroot+1;
        }
        // for right
        int rightroot=ansester(root.right,target,k,ans);
        if(rightroot!=-1){
            if(rightroot+1==k){
                ans.add(root.val);
            }else{
                subset(root.left,k-rightroot-2,ans);
                
            }
            return rightroot+1;
        }
        return -1;
        
    }
  
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
         ansester( root, target,  k,  ans);
         return ans;

        
        
       

        }

    
}

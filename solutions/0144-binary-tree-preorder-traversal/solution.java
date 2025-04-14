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
       ans.add(root.val);

        helper(root.left,ans);
        helper(root.right,ans);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        // ArrayList<Integer> ans=new ArrayList<>();
        // helper(root,ans);
        // return ans;
    







    //Using Iteration 
    ArrayList<Integer> ans=new ArrayList<>();
    if(root==null) return ans;
    Stack<TreeNode> st=new Stack<>();

    st.push(root);
    while(!st.empty()){
        TreeNode front=st.pop();
        ans.add(front.val);
        if(front.right!=null) st.push(front.right);
         if(front.left!=null) st.push(front.left);
    }
    return ans;


    }
}

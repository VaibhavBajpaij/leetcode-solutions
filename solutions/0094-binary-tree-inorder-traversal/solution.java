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
    // Create a list to store the inorder traversal
    ArrayList<Integer> ans = new ArrayList<>();

    // If the tree is empty, return the empty list
    if (root == null) return ans;

    // Stack to simulate recursion
    Stack<TreeNode> st = new Stack<>();
    TreeNode temp = root;

    // Infinite loop to traverse until stack is empty and temp is null
    while (true) {
        // Go as left as possible
        if (temp != null) {
            st.push(temp);       // Push current node to stack
            temp = temp.left;    // Move to left child
        } else {
            if (st.size() == 0) break; // If stack is empty, traversal is done

            TreeNode top = st.pop();  // Pop the top node
            ans.add(top.val);         // Add the value to result list

            temp = top.right;         // Move to the right child
        }
    }
    

    return ans;
    }
}


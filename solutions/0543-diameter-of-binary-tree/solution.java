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
// class Solution {
//     private int max(int a, int b,int c){
//         return Math.max(a,Math.max(b,c));

//     }
//     private int level(TreeNode root){
//         if(root==null) return 0;
//         return 1+Math.max(level(root.left), level(root.right));
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null) return 0;

//         int demiter =level(root.left)+level(root.right);
//         int left=diameterOfBinaryTree(root.left);
//         int right=diameterOfBinaryTree(root.right);
//         return max(demiter,left,right);    
//     }
// }


// dp solution 
 class Solution {
public int levels(TreeNode root, Map<TreeNode,Integer> dp) {
    if(root==null) return 0;
    if(dp.containsKey(root)) return dp.get(root);
    int leftLevels = levels(root.left,dp);
    int rightLevels = levels(root.right,dp);
    dp.put(root,1 + Math.max(leftLevels,rightLevels));
    return dp.get(root);
        }
 public int diameter(TreeNode root, Map<TreeNode,Integer> dp) {
    if(root==null) return 0;
    int myDia = levels(root.left,dp) + levels(root.right,dp);
    int leftDia = diameter(root.left,dp);
    int rightDia = diameter(root.right,dp);
    return Math.max(myDia,Math.max(leftDia,rightDia));
        }
    public int diameterOfBinaryTree(TreeNode root) {
    Map<TreeNode,Integer> dp = new HashMap<>();
    return diameter(root,dp);
        }
 }

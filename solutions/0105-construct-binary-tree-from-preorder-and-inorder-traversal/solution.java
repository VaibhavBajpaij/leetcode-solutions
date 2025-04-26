
class Solution {

    private TreeNode tree(int [] preorder,int [] inorder,int prelo,int prehi,int inlo ,int inhi ){
        if(prelo>prehi || inlo>inhi) return null;
        TreeNode root=new TreeNode(preorder[prelo]);
        int r=0;   
        while(preorder[prelo]!=inorder[r])r++;
        int leftshift=r-inlo;
        root.left=tree(preorder,inorder,prelo+1,prelo+leftshift,inlo,r-1);
        root.right=tree(preorder,inorder,prelo+leftshift+1,prehi,r+1,inhi);
        return root;
        
     

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length-1;
        return tree(preorder,inorder,0,n,0,n);
        
    }
}

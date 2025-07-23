class Solution {
// recursion soltion TLE
    public int path(int [][] arr,int m,int n,int [][] dp){
        if(n<0 || m<0) return 0;
        if(n==0 && m==0) return 1;
        int left=0;
        int right=0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(arr[m][n]==0) left=path(arr,m-1,n,dp);
        if(arr[m][n]==0) right=path(arr,m,n-1,dp);
        return dp[m][n]= left+right;
    }
    public int uniquePathsWithObstacles(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        
        if(nums[0][0]==1) return 0;
    
        if(nums[m-1][n-1]==1) return 0;
        if(n==1 && m==1) return 1;

        int [][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
       return  path(nums,m-1,n-1,dp);
        
        
    }
}

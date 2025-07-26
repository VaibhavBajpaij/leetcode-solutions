class Solution {
    static int sum;
    public int  findTarget(int [] nums,int target,int res,int i,int [][] dp){
        if(i==nums.length){
            if(target==res) return 1;
            else return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];

        int add= findTarget(nums,target,res+nums[i],i+1,dp);
        int sub= findTarget(nums,target,res-nums[i],i+1,dp);

        return  dp[i][res+sum]=add+sub;


    }
    public int findTargetSumWays(int[] nums, int target) {
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int [][] dp=new int [nums.length][2*sum+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }


       return  findTarget(nums,target,0,0,dp);
    }
}

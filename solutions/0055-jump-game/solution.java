class Solution {
    public boolean canJump(int[] nums) {
        // int n=nums.length;
        // if(n==1) {
        //     if(nums[0]>=1) return true;
        // }

        // for(int i=0;i<n;i++){
        //     int x=nums[i];
        //     if(x+i>=n) return false;
        //     else i+=nums[i];
        // }
        // return true;
        int [] dp=new int[nums.length-1];
        Arrays.fill(dp,-1);
        return canreach(nums,0,dp);

        
    }
    public boolean canreach(int [] nums,int index,int [] dp){

        if(index>=nums.length-1) return true;
        int maxJump = nums[index];
        if(dp[index]!=-1) return dp[index]==1;
        for(int step=1;step<=maxJump;step++){
            if(canreach(nums,index+step,dp)){
                dp[index]=1;
                return true;
            }
        }
        dp[index]=0;
        return false;
        
    }
}

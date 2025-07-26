class Solution {
    public  Boolean subset(int arr[], int sum,int i, int sub,int [][] dp){
        if(i==arr.length){
            if(sum==sub) return true;
            else return  false;
            
        }
        if(i>arr.length) return false;
        if(sub>sum) return false;
        if(dp[i][sub]!= -1) return (dp[i][sub]==1);
        Boolean ans=false;
        
        boolean skip= subset( arr, sum,i+1,sub,dp);
        if(sub+arr[i]>sum){
            ans=skip;
           if(ans){
            dp[i][sub]=1;
         }else{
            dp[i][sub]=0;
         }
        return ans;
           
        }
        else{
        boolean take=subset(arr,sum,i+1,sub+arr[i],dp);
         ans = skip || take;
          if(ans){
            dp[i][sub]=1;
        }else{
            dp[i][sub]=0;
        }
        return ans;
        }    
        
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

        }
        if(sum%2!=0)return false;
        int [][] dp=new int [nums.length][(int)sum/2+1];
        for(int i=0 ;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return subset( nums, (int)sum/2,0,0, dp);
       
        
    }
}

class Solution {
    public long coin(int [] coins ,int amount ,int i,long [][] dp){
       if(i==coins.length){
        if(amount==0) return 0;
        else return Integer.MAX_VALUE;
       }
        if(dp[i][amount]!= -1) return dp[i][amount];

        long skip= coin(coins,amount,i+1,dp);
        if(amount-coins[i]<0) return dp[i][amount]= skip;

        long take= 1+coin(coins,amount-coins[i],i,dp);
        
        return dp[i][amount]= Math.min(skip,take);
    }
    public int coinChange(int[] coins, int amount) {
        long [][] dp=new long [coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans= (int)coin(coins,amount,0,dp);
        if(ans==Integer.MAX_VALUE) return -1;
        else return ans;

        
    }
}

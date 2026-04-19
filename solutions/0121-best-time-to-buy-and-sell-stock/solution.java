class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int len=prices.length;
        int m=prices[len-1];
        for(int i=len-2;i>=0;i--){
            if(m>prices[i]){
                profit=Math.max(profit,m-prices[i]);
            }
            else{
                m=prices[i];
            }
        }
        return profit;
        
    }
}

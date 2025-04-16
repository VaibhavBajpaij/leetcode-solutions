class Solution {
    public int maxProfit(int[] prices) {
        int Maxprofit=0;
        int i=0;
        int j=1;

       while(j<prices.length){
        //if(i==j) j++;
        if(prices[i]>prices[j]){
            i=j;
            j++;
        }
        else if(prices[i]<=prices[j]){
            int sub=prices[j]-prices[i];
            Maxprofit=Math.max(sub,Maxprofit);
            j++;
        }
            
        }
        return Maxprofit;
        
    }
}

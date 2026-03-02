class Solution {
    public int maxProfit(int[] prices) {

        // time complexity is O(n2)
        // int m=0;
        // for(int i=0;i<prices.length ;i++){
        //     for(int j=i+1;j<prices.length ;j++){
        //         m=Math.max(m,prices[j]-prices[i]);
        //     }
        // }
        // return m;

        int [] arr=new int [prices.length];

        int j=0;
        int ma=prices[prices.length-1];
        arr[prices.length-1]=prices[prices.length-1];

        for(int i=prices.length-2 ; i>=0 ; i--){

            ma=Math.max(ma, prices[i]);
            arr[i]=ma;

            j++;
        }

        int m=0;

        for(int i=0 ; i<prices.length ;i++){

            m=Math.max(m,arr[i]-prices[i]);
        }
        return m;

    }
}

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int k=bookings.length;
        int [] ans=new int[n];
        for(int i=0;i<k;i++){
            int f=bookings[i][0];
            int l=bookings[i][1];
            int num=bookings[i][2];

           ans[f-1]+=num;
           if(l<n)ans[l]-=num;
        }
        for(int i=1;i<n;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
        
    }
}

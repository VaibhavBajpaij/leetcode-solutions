class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {

        int n=customers.length;
        int totalstaisfied=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                totalstaisfied=customers[i]+totalstaisfied;

            }
        }
        int max=0;
        for(int i=0;i<k;i++){
            if(grumpy[i]==1) max=max+customers[i];
        }
        int ans=0;
        ans=Math.max(ans,max);
        for(int i=k;i<n;i++){
            if(grumpy[i-k]==1){
                max=max-customers[i-k];
            }
            if(grumpy[i]==1){
                max=max+customers[i];
            }
            ans=Math.max(ans,max);
        }
        int finalans=ans+ totalstaisfied;
        return finalans;

    }
}

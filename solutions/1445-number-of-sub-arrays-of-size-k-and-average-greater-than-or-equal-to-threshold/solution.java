class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count =0;
        int ans=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            ans=ans+arr[i];
            
        }
         if(threshold<=ans/k) count++;
        for(int i=k;i<n;i++){
             ans=ans+arr[i];
             ans=ans-arr[i-k];
            if(threshold<=ans/k) count++;
            
            
        }

        return count;
        
    }
}

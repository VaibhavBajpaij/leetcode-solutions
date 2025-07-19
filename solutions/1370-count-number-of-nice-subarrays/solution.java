class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0;
        int j=0;
        int a=0;
        int b=0;
        int n=nums.length;
        int k2=0;


      while(j<n &&  k2<k)  {
        if(nums[j++]%2!=0) k2++;
        
      }
      if(k2<k) return 0;
      j--;
      while(i<n && nums[i]%2==0) i++;
      b=j+1;
      while(b<n && nums[b]%2==0){
        b++;
      }
      b--;
    int count=0;
      while(b<n){
        count=count+(b-j+1)*(i-a+1);
        a=i+1;
        i++;
        while(i<n && nums[i]%2==0) i++;
        j=b+1;
        b=j+1;
        while(b<n && nums[b]%2==0) b++;
        b--;

      }
      return count;
        
    }
}

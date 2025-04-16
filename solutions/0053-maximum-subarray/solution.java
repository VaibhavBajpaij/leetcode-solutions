class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int summax=Integer.MIN_VALUE;
        int sum=0;
        //int min=Interger.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            sum=sum+ele;
            //min=Math.min(ele,min);

            
            summax=Math.max(sum,summax);  
            if(sum<0 ){
                sum=0;
            } 
        }
       return summax;
       
        
    }
}

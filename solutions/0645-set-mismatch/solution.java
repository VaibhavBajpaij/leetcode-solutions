class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int [] arr=new int[2];
        for(int i=0;i<nums.length-1 ;i++){
            if(nums[i+1]==nums[i]){
                arr[0]=nums[i];
                
            }
        }
        int [] arr1=new int[nums.length];

        for (int i=0 ;i<nums.length;i++){
            arr1[nums[i]-1]=nums[i];
                

            
        }
        for(int i=0 ;i<arr1.length;i++){
            if(arr1[i]==0){
                arr[1]=i+1;
                break;
            }
        }
        return arr;

        
    }
}


class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count = 0;
        // int n = nums.length;

        
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;

        //     for (int j = i; j < n; j++) {
        //         sum += nums[j]; 

        //         if (sum == k) {
        //             count++;
        //         }
        //     }
        // }

        // return count;


        int count = 0;
        int n = nums.length;

        
        for (int i = 1; i < n; i++) {
           nums[i]+=nums[i-1];
            }
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int ele=nums[i];
            if(ele==k) count++;
            int rem=ele-k;
            if(map.containsKey(rem)) count+=map.get(rem);
            if(map.containsKey(ele)){
                int fe=map.get(nums[i]);
                map.put(nums[i],fe+1);

            }else{
                map.put(ele,1);
            }
        }

        return count;
    }
}


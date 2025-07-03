class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> arr=new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j > i+1 && nums[j]==nums[j-1]) continue;

                int s=j+1;
                int l=nums.length-1;
                while(s<l){
                    long curr = (long) nums[i] + nums[j] + nums[s] + nums[l];;
                    if(curr==target) {
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[s]);
                        list.add(nums[l]);
                        // Collections.sort(list);
                         arr.add(list);
                         s++;
                        l--;
                    
                  while (s < l && nums[s] == nums[s - 1]) s++;
                        while (s < l && nums[l] == nums[l + 1]) l--;
                    }else if (curr < target) {
                        s++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return arr;
    }
}

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(-1,-1);
        int ans=0;
        int sum=-1;

        
        

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) sum+=-1;
            else sum+=1;
            
            if(map.containsKey(sum)){
                int x=map.get(sum);
                ans=Math.max(ans,i-x);
                System.out.println(ans +"this is inside" +sum);
            }
            System.out.println(ans +"  "+ sum);
           if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            
        }
        return ans;

        
    }
}    

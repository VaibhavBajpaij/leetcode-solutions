class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums.sort();
        count=1;
        m=1
        if(len(nums)==0):
            return 0
        a=nums[0]
        for i in range(1,len(nums)):
            if(nums[i]==nums[i-1]+1):
                
                count+=1
            elif(nums[i]!=nums[i-1]):
                count=1;
            m=max(count,m);
        return m;
            
        

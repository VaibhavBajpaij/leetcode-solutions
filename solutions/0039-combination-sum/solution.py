class Solution:
    def helper(self,nums,target,i,ans,temp):
        if(i==len(nums)):
            if(target==0):
                ans.append(temp[:])
            return 
        
        if(nums[i]<=target):
            temp.append(nums[i])
            self.helper(nums,target-nums[i],i,ans,temp)
            temp.pop()
            
           
        self.helper(nums,target,i+1,ans,temp)
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        temp=[]
        ans=[]
        self.helper(candidates,target,0,ans,temp)
        return ans
        

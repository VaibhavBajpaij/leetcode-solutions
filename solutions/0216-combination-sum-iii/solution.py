class Solution:
    def helper(self,nums,k,target,i,temp,ans):
        if(len(temp)==k):
            if(sum(temp)==target):
                ans.append(temp[:])
            return 
        if(i==9):
            return 
        temp.append(nums[i])
        self.helper(nums,k,target,i+1,temp,ans)
        temp.pop()
        self.helper(nums,k,target,i+1,temp,ans)

    def combinationSum3(self, k: int, n: int) -> List[List[int]]:
        nums=list(range(1, 10))
        temp=[]
        ans=[]
        self.helper(nums,k,n,0,temp,ans)
        return ans

        

class Solution:
    def helper(self,nums,i,temp,ans):
        if(i==len(nums)):
            ans.add(tuple(temp[:]))
            return
        
        temp.append(nums[i])
        self.helper(nums,i+1,temp,ans)
        temp.pop()
        self.helper(nums,i+1,temp,ans)

    def subsets(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        temp=[]
        ans=set()
        self.helper(nums,0,temp,ans)
        result=[list(x) for x in ans]
        return result 

        

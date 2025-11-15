class Solution:
    def revesves( self,i,j,nums):
        while(i<j):
            nums[i],nums[j]=nums[j],nums[i]
            i+=1 
            j-=1

    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        x = n - 2
        while x >= 0 and nums[x] >= nums[x + 1]:
            x -= 1
    # swap
        print(x)
        if x==-1:
            self.revesves(0,n-1,nums)
            return
         # 3. Find next greater element (from right)
        j = n - 1
        while nums[j] <= nums[x]:
            j -= 1 
        
        nums[x],nums[j]=nums[j],nums[x]
    
    
        self.revesves(x+1,n-1,nums)
        return 
    
        

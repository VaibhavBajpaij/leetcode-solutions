class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        # O(n2)
        # n=len(nums)
       
       
        # res=[]
        # for i in range(n):
        #     m=1
        #     for j in range(i,n):
        #         m*=nums[j]
        #         res.append(m)
            
                
                
        # return max(res)

        
        max_product=nums[0]
        min_product=nums[0]
        ans=nums[0]

        for n in nums[1:]:

            if n<0:
                max_product,min_product=min_product,max_product
            max_product=max(n,max_product*n)
            min_product=min(n,min_product*n)
            ans=max(max_product,ans)
             
        return ans

        

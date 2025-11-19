class Solution:
    def trap(self, height: List[int]) -> int:
        left=[]
        ma=0
        right=[]
        for i in range(len(height)):
            ma=max(ma,height[i])
            left.append(ma)
        ma=0
        for i in range(len(height)-1,-1,-1):
            ma=max(ma,height[i])
            right.append(ma)
        right.reverse()  
        ans=0
        for i in range(len(height)):
            ans+=min(left[i],right[i])-height[i]
            # if(val>=0):
            #     ans+=val
        return ans
                
        


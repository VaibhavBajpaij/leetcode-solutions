class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        i=0
        j=len(height)-1
        m=0
        while(i<j):
            l=height[i]
            r=height[j]
            mi=min(l,r)
            area=mi*(j-i)
            m=max(m,area)
            if(l<r):
                i+=1
            else:
                j-=1
        return m


class Solution(object):
    def hIndex(self, citations):
        """
        :type citations: List[int]
        :rtype: int
        """
        citations.sort(reverse=True)
        h=1
        ans=0
        for val in citations:
            if(val>=h):
                h+=1
                ans+=1
            else:
                break
        return ans
            

        

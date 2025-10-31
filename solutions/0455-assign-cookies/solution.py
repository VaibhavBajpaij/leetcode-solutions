class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        g.sort()
        s.sort()
        ans=0
        
        # for greed in g:
        #     if(len(s)==0):
        #         return ans
        #     for cok in s:
        #         if(cok>=greed):
        #             ans+=1
        #             s.remove(cok)
        #             break
        # return ans

        # optimal aproch
        i=0
        j=0
        gl=len(g)
        sl=len(s)
        while(i<gl and j<sl):
            if(s[j]>=g[i]):
                ans+=1
                i+=1
                j+=1
            else:
                j+=1
        return ans 
    

        

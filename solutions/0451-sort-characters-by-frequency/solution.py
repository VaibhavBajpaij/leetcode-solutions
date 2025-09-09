class Solution(object):
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        d={}
        for i in s:
            d[i]=d.get(i,0)+1

        sd = sorted(d.items(), key=lambda item: item[1], reverse=True)
        print(sd)
        ans=''
        for v,f in sd:
            
            ans+=f*v
        return ans

        
        

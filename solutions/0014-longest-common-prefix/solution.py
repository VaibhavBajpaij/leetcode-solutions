class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        s=strs[0]
       
        for i in range(1,len(strs)):
            a=""
            c=strs[i];
            n1=len(s)
            n2=len(c)
            if(n1>n2):
                j=0
                
                while(j<n2):
                    if(c[j]==s[j]):
                        a+=s[j]
                        j+=1
                    else:
                        s=a
                        break
            else:
                j=0
                
                while(j<n1):
                    if(c[j]==s[j]):
                        a+=s[j]
                        j+=1
                    else:
                        s=a
                        break
            s=a
        return s


            
        

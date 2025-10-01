class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        i=0
        s=0
        j=0
        n=len(haystack)
        while(i<=n-len(needle)):
            if(haystack[i]==needle[0]):
                for k in range(len(needle)):
                    if(k==len(needle)-1 and haystack[i+k]==needle[k]):
                        return i
                    elif (haystack[i+k]!=needle[k]):
                        break
            i+=1
        return -1


class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if(haystack==needle):
            return 0

        lh=len(haystack)
        ln=len(needle)
        # if(ln==1):
        #     for i in range(0,lh):
        #         if(haystack[i]==needle):
        #             return i

        for i in range(0,lh-ln+1):
            if(haystack[i:i+ln]==needle):
                return i;
        return -1
        

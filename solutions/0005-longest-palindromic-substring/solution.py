class Solution:
    def extend_from_center(self,s:str,i:int,j:int):
        while(i>=0 and j<len(s) and s[i]==s[j]):
            i-=1
            j+=1
        return s[i+1:j]

    
    def longestPalindrome(self, s: str) -> str:
        n=len(s)
        if(n<2):
            return s
       
        ans=""

        for i in range(len(s)):
            odd=self.extend_from_center(s,i,i)
            even=self.extend_from_center(s,i,i+1)

            longer=even if(len(even)>len(odd)) else odd

            if(len(ans)<len(longer)):
                ans=longer

        
       
        return ans


    


        

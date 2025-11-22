class Solution:
    def peak(self,n):
        s=str(n)
        ans=0
        for i in range(1,len(s)-1):
            if(int(s[i-1])<int(s[i]) and int(s[i+1])<int(s[i])):
                ans+=1
        return ans
    def valley(self,n):
        s=str(n)
        ans=0
        for i in range(1,len(s)-1):
            if(int(s[i-1])>int(s[i]) and int(s[i+1])>int(s[i])):
                ans+=1
        return ans
            
    def totalWaviness(self, num1: int, num2: int) -> int:
        x=len(str(num2))
        if(x < 3):
            return 0
        ans=0
        for val in range(num1,num2+1):
            ans+=self.peak(val)+self.valley(val)
        return ans
        

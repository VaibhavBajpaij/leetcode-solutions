class Solution:
    def minimumFlips(self, n: int) -> int:
        binary = str(bin(n)[2:])
        reverse=binary[::-1]
        ans=0
        for i in range(len(binary)):
            if(binary[i]!=reverse[i]):
                ans+=1
        return ans

        

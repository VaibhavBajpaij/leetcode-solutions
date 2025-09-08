class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        # l=[]
        # ans=""
        # for i in s:
        #     if(i=='(' and len(l)==0):
        #         l.append(i)
        #     elif(i=='(' and len(l)!=0):
        #         l.append(i)
        #         ans+=i
        #     elif(i==')'):
        #         l.pop()
        #         if(len(l)!=0):
        #             ans+=i;
        # return ans;
 #now without using extra splace

        c=0;
        ans=''
        for i in s:
            if(i=='(' and c==0):
                c=1
            elif(i=='(' and c!=0):
                c+=1
                ans+=i
            elif(i==')'):
                c-=1
                if(c!=0):
                    ans+=i;

        return ans

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        ans=[]
    
        for val in tokens:
            if(val=='+' or val=='-' or val=='*' or val=='/'):
                y=int(ans.pop())
                x=int(ans.pop())
                a=0
                if(val=='+'):
                    a=x+y 
                elif(val=='-'):
                    a=x-y 
                elif(val=='*'):
                    a=x*y  
                else:
                    a=x/y  
                ans.append(a)
            else:
                ans.append(val)
        return int(ans[0])
        

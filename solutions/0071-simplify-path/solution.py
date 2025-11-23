class Solution:
    def simplifyPath(self, path: str) -> str:
        token=path.split('/')
        arr=[]
        for val in token:
            if(val=="" or val=="."):
                continue
            elif(val==".."):
                if arr:
                    arr.pop()
            else:
                arr.append(val)
        return "/"+"/".join(arr)


        

class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        map1={}
        for val in words:
            map1[val]=map1.get(val,0)+1
        w=len(words[0])
        ans=[]
        for i in range(len(s) - w*len(words) + 1):

            map2=map1.copy()
            flag=True
            k=i
            
            
            for j in range(len(words)):
                if k + w > len(s):   # <-- important fix
                    flag = False
                    break
                sub=s[k:k+w]
                
                
                if sub in map2:
                    x=map2.get(sub)
                    if(x==1):
                        del map2[sub]
                    else:
                        map2[sub]=map2.get(sub) - 1
                else:
                    flag=False
                    break
                k+=w
            
            if flag and not map2:
                ans.append(i)
        return ans

                

        

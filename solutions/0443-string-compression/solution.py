class Solution:
    def compress(self, chars: List[str]) -> int:
        i=0;
        j=0;
        length=len(chars)
        k=0
        s=""
        while(j<length):
            if(chars[i]!=chars[j]):
                l=j-i
                if(l==1):
                    chars[k]=chars[i]
                    k+=1
                else:
                    chars[k]=chars[i]
                    k+=1
                    st=str(l)
                    for i in st:
                        chars[k]=i
                        k+=1
                         
                i=j
            j+=1
        chars[k]=chars[i]
        k+=1
        if(j-i>1):
            st=str(j-i)
            for i in st:
                chars[k]=i
                k+=1
        return k

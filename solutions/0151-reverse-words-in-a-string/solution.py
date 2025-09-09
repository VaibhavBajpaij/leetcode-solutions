class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        # l=[]
        # c=''
        # s.strip()
        # for i in range(len(s)):
        #     if(s[i]==' ' and c!=''):
        #         l.append(c)
        #         c=''
        #     elif(s[i]!=' '):
        #         c+=s[i]
        # if(c!=''):
        #     l.append(c)
        # l.reverse()
        
        # a=''
        # print(l)
        # for i in range(len(l)):
        #     c=l[i]
        #     a+=c
        #     if(i!=len(l)-1):
        #         a+=" "
        # return a

        return " ".join(reversed(s.strip().split()))
            
        

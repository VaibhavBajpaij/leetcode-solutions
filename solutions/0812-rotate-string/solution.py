# class Solution(object):
#     def rotateString(self, s, goal):
#         """
#         :type s: str
#         :type goal: str
#         :rtype: bool
#         """

#         l=s+s
#         n=len(l)
#         if(len(s)!=len(goal)):
#             return False

       
#         j=0
#         while(n>j):
#             i=0
#             c1=l[j];
#             c2=goal[0]
#             if(c1==c2):
#                 while(len(goal)>i and n>j):  
#                     if(i==len(goal)-1):
#                         return True              
#                     if(l[j]!=goal[i]):
#                         break
#                     i+=1
#                     j+=1
#             j+=1
        
       
#         return False


class Solution(object):
    def rotateString(self, s, goal):
        """
        :type s: str
        :type goal: str
        :rtype: bool
        """
        # l = s + s
        # n = len(l)

        # if len(s) != len(goal):
        #     return False

        # # Try to match goal starting at every position in l
        # for start in range(len(s)):  # only need to check first len(s) positions
        #     i = 0
        #     while i < len(goal) and l[start + i] == goal[i]:
        #         i += 1
        #     if i == len(goal):
        #         return True

        # return False



        # smallest code
        if len(s) != len(goal):
            return False
        return goal in (s + s)

            
        

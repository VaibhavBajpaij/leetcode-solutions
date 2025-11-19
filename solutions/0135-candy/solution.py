class Solution:
    def candy(self, ratings: List[int]) -> int:
        canndy=[1]*len(ratings)

        for i in range(1,len(ratings)):
            if(ratings[i]>ratings[i-1]):
                canndy[i]=canndy[i-1]+1
        for i in range(len(ratings)-2,-1,-1):
            if(ratings[i]>ratings[i+1]):
                canndy[i]=max(canndy[i],canndy[i+1]+1)
        print(canndy)
        return sum(canndy)

        

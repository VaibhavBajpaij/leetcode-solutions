class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        
        map={}
        for i in range(len(nums)):
            val =nums[i]
            if val in map:
                j=map.get(val)
                if(abs(i-j)<=k):
                    return True
                else:
                    map[val]=i
                    continue
               

            else:
                map[val]=i
       
        print(map)
           
                
        
        return False

           
        

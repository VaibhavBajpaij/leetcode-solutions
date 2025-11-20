class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        map={}
        for ch in ransomNote:
            map[ch]=map.get(ch,0)+1
        
        for ch in magazine:
            if ch in map:
                x=map.get(ch)
                if(x==1):
                    del map[ch]
                else:
                    map[ch]=x-1
        if not map:
            return True
        else:
            return False

        

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        arr = s.split(" ")
        
        # Check if number of words matches number of pattern chars
        if len(pattern) != len(arr):
            return False
        
        mp = {}          # pattern → word
        used = set()     # track words already mapped
        
        for i in range(len(pattern)):
            p = pattern[i]
            w = arr[i]
            
            if p in mp:
                if mp[p] != w:
                    return False
            else:
                # If word already used by another pattern char → invalid
                if w in used:
                    return False
                
                mp[p] = w
                used.add(w)
        
        return True


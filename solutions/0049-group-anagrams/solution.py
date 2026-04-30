class Solution:
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        dict=defaultdict(list)

        for val in strs:
            key="".join(sorted(val))
            dict[key].append(val)
        return list(dict.values())

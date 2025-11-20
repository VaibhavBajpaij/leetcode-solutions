class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        se = set()
        i = 0
        j = 0
        n = len(s)
        ans = 0

        while j < n:
            val = s[j]

            if val in se:
                while s[i] != val:
                    se.remove(s[i])
                    i += 1
                se.remove(s[i])
                i += 1
            else:
                se.add(val)
                ans = max(ans, j - i + 1)
                j += 1

        return ans


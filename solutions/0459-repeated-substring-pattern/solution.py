class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        l = len(s)

        for high in range(1, l):
            sub = s[0:high]

            # only consider valid lengths
            if l % len(sub) != 0:
                continue

            p = l // len(sub)

            if sub * p == s:
                return True

        return False

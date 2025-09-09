class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        roman_map = {'I': 1, 'V': 5, 'X': 10, 'L': 50,
                     'C': 100, 'D': 500, 'M': 1000}
        
        n = 0
        prev = 0
        
        for ch in reversed(s):  # start from right
            value = roman_map[ch]
            if value < prev:
                n -= value  # subtract if smaller before larger
            else:
                n += value  # otherwise add
            prev = value
        
        return n


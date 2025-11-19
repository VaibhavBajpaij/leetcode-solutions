import random

class RandomizedSet:

    def __init__(self):
        self.map = {}      # val -> index
        self.arr = []      # list of values

    def insert(self, val: int) -> bool:
        if val in self.map:
            return False
        
        self.map[val] = len(self.arr)
        self.arr.append(val)
        return True

    def remove(self, val: int) -> bool:
        if val not in self.map:
            return False
        
        idx = self.map[val]      # index of val
        last_val = self.arr[-1]  # last element

        # Move last element to idx
        self.arr[idx] = last_val
        self.map[last_val] = idx

        # Remove last
        self.arr.pop()
        del self.map[val]

        return True

    def getRandom(self) -> int:
        return random.choice(self.arr)


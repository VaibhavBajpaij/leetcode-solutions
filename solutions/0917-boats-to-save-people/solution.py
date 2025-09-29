class Solution(object):
    def numRescueBoats(self, people, limit):
        """
        :type people: List[int]
        :type limit: int
        :rtype: int
        """
        people.sort()
        i, j = 0, len(people) - 1
        boats = 0

        while i <= j:
            # If the lightest and heaviest can share a boat
            if people[i] + people[j] <= limit:
                i += 1   # lightest goes with heaviest
            # Either way, heaviest person uses one boat
            j -= 1
            boats += 1

        return boats


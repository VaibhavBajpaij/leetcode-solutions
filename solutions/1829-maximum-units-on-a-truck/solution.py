class Solution(object):
    def maximumUnits(self, boxTypes, truckSize):
        """
        :type boxTypes: List[List[int]]
        :type truckSize: int
        :rtype: int
        """
        # Step 1: Sort by units per box in descending order
        boxTypes.sort(key=lambda x: x[1], reverse=True)

        ans = 0
        curr = 0

        # Step 2: Greedily take boxes
        for boxes, units in boxTypes:
            if curr + boxes <= truckSize:
                # Take all boxes
                ans += boxes * units
                curr += boxes
            else:
                # Take only what fits
                remaining = truckSize - curr
                ans += remaining * units
                break  # Truck is full

        return ans


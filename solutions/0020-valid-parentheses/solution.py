class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for val in s:
            if val in "([{":
                stack.append(val)
            else:
                if not stack:
                    return False

                if (val == ")" and stack[-1] == "(") or \
                   (val == "]" and stack[-1] == "[") or \
                   (val == "}" and stack[-1] == "{"):
                    stack.pop()
                else:
                    return False

        return len(stack) == 0

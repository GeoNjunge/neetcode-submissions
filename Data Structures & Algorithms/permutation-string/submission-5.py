class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s2) < len(s1):
            return False

        l = 0
        r = len(s1) - 1

        while r < len(s2):
            counts = {}
            for char in s2[l:r + 1]:
                counts[char] = counts.get(char, 0) + 1

            for char in s1:
                if char not in counts or counts[char] == 0:
                    break
                counts[char] -= 1

            if all(val == 0 for val in counts.values()):
                return True

            l += 1
            r += 1

        return False


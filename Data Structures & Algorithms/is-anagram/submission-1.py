class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        map = {}

        return sorted(s) == sorted(t)

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        
        hash_table = [0] * 26

        for i in range(len(s)):
            hash_table[ord(s[i]) - ord('a')] += 1

        for j in range(len(t)):
            hash_table[ord(t[j]) - ord('a')] -= 1

        for val in hash_table:
            if val != 0:
                return False

        return True

        

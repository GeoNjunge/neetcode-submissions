class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        visit = set()
        for preq, val in edges:
            if val in visit:
                return False
            visit.add(val)

        return True

class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        if not n:
            return False

        adj = { i: [] for i in range(n)}

        for prev, nxt in edges:
            adj[prev].append(nxt)
            adj[nxt].append(prev)

        visit = set()

        def dfs(i, prev):
            if i in visit:
                return False

            visit.add(i)

            for child in adj[i]:
                if child == prev:
                    continue
                if not dfs(child, i):
                    return False

            return True

        return dfs(0, -1) and n == len(visit)

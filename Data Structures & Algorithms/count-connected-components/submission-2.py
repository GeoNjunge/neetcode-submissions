class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        parent = [i for i in range(n)]
        rank = [1] * n

        def find(node):
            cur = node
            while cur != parent[cur]:
                parent[cur] = parent[parent[cur]]
                cur = parent[cur]
            return cur

        def union(u, v):
            pu = find(u)
            pv = find(v)

            if pu == pv:
                return 0

            if rank[pv] > rank[pu]:
                parent[pu] = pv
                rank[pv] += rank[pu]
            else:
                parent[pv] = pu
                rank[pu] += rank[pv]
            return 1

        res = n
        for u, v in edges:
            res -= union(u, v)
        return res


class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        ROWS, COLS = len(board), len(board[0])
        path = set()

        def dfs(i, j, w):
            if w == len(word):
                return True
            if (i < 0 or j < 0 or
            i >= ROWS or j >= COLS or
            word[w] != board[i][j] or 
            (i, j) in path):
             return False

            path.add((i, j))
            res = (
                    dfs(i + 1, j, w + 1) or 
                    dfs(i, j + 1,w + 1) or 
                    dfs(i, j - 1, w + 1) or
                    dfs(i - 1, j, w + 1) )
            path.remove((i, j))

            return res

        for i in range(ROWS):
            for j in range(COLS):
                if dfs(i, j, 0):
                    return True

        return False
        

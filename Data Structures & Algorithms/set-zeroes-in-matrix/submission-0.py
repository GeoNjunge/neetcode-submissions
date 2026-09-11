class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        visited = []
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j] == 0:
                    visited.append([i, j])

        for row, col in visited:
            matrix[row][:] = [0] * len(matrix[row][:])
            for row in matrix:
                row[col] = 0

        
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ROWS, COLS = len(matrix), len(matrix[0])
        top, bottom = 0, ROWS

        while top < bottom:
            row = (bottom + top) // 2

            if target > matrix[row][-1]:
                top = row + 1
            elif target < matrix[row][0]:
                bottom = row
            else:
                break

        if not (top < bottom):
            return False

        row = (top + bottom) // 2
        l, r = 0, COLS
        while l < r:
            mid = (r + l) // 2

            if target > matrix[row][mid]:
                l = mid + 1
            elif target < matrix[row][mid]:
                r = mid
            else:
                return True

        return False
                
        
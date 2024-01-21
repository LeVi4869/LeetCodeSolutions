class Solution:
    def minFallingPathSum(self, matrix: List[List[int]]) -> int:
        for i in range(1, len(matrix)):
            for j in range(0, len(matrix)):
                matrix[i][j] = matrix[i][j] + min(min(matrix[i - 1][max(0, j - 1)], matrix[i - 1][j]), matrix[i - 1][min(len(matrix) - 1, j + 1)])
        res = matrix[len(matrix) - 1][0]
        for i in range(1, len(matrix)):
            res = min(res, matrix[len(matrix) - 1][i])
        return res

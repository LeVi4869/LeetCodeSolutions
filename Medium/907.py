class Solution:
    def sumSubarrayMins(self, A):
        res = 0
        stack = []  #  non-decreasing 
        A = [float('-inf')] + A + [float('-inf')]
        for i, n in enumerate(A):
            while stack and A[stack[-1]] > n:
                cur = stack.pop()
                res += A[cur] * (i - cur) * (cur - stack[-1]) 
            stack.append(i)
        return res % (10**9 + 7)
        
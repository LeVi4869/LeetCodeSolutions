# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
        return self.helper(root, root.val, root.val)
    def helper(self, root, maxVal, minVal):
        if(root == None): 
            return maxVal - minVal
        maxVal = max(maxVal, root.val)
        minVal = min(minVal, root.val)
        return max(self.helper(root.left, maxVal, minVal), self.helper(root.right, maxVal, minVal))

        
        
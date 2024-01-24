def pseudoPalindromicPaths (self, root: Optional[TreeNode]) -> int:
        def traverse(node, pairs):
            if not node:
                return 0
            if node.val in pairs:
                pairs.remove(node.val)
            else:
                pairs.add(node.val)
            if not node.left and not node.right:
                return 1 if len(pairs) <= 1 else 0
            left = traverse(node.left, set(pairs))
            right = traverse(node.right, set(pairs))
            return left + right
            
        return traverse(root, set())
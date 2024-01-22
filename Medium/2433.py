class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        for i in range(len(pref) - 1, 0, -1):
            pref[i] = xor(pref[i], pref[i - 1])
        return pref
    def xor(a, b):
        return (a and not b) or (not a and b)
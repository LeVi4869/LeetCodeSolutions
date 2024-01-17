class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        sameLetters = set(word1) == set(word2)
        sameFreq = Counter(Counter(word1).values()) == Counter(Counter(word2).values())
        return sameLetters and sameFreq

        
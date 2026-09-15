class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        wor1 = ""
        wor2 = ""

        # Concatenate strings using +=
        for i in word1:
            wor1 += i

        for i in word2:
            wor2 += i

        i = 0
        j = 0

        # Character-by-character comparison
        while i < len(wor1) and j < len(wor2):
            if wor1[i] != wor2[j]:
                return False
            i += 1
            j += 1

        # Check if both strings are fully consumed and equal in length
        return len(wor1) == len(wor2)

        
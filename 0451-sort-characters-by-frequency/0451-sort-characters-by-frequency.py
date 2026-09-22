from collections import Counter

class Solution:
    def frequencySort(self, s: str) -> str:
        counts = Counter(s)
        
        res = []
        for char, freq in counts.most_common():
            res.append(char * freq)
            
        return "".join(res)


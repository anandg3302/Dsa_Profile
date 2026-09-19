import heapq
from collections import Counter

class Solution:
    def topKFrequent(self, words: list[str], k: int) -> list[str]:
        count = Counter(words)
        return heapq.nsmallest(k, count.keys(), key=lambda w: (-count[w], w))
        
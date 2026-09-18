import heapq

class Solution:
    def lastStoneWeight(self, stones: list[int]) -> int:
        pq = []
        for x in stones:
            pq.append(-x)
            
        heapq.heapify(pq)
        
        while len(pq) > 1:
            a = heapq.heappop(pq)
            b = heapq.heappop(pq)
            
            if a != b:
                heapq.heappush(pq, a - b)

        if len(pq) > 0:
            return -pq[0]
        else:
            return 0
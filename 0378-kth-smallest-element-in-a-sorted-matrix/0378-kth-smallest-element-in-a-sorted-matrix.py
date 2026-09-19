class Solution:
    def kthSmallest(self, matrix: list[list[int]], k: int) -> int:
        pq = []
        for row in matrix:
            for val in row:
                heapq.heappush(pq,-val)
                if len(pq) > k:
                      heapq.heappop(pq)
            
            
        return -pq[0]
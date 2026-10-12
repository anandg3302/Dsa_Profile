class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jwl = set(jewels)
        count = 0
        
        for ch in stones:
            if ch in jwl:
               count += 1
        
        return count 
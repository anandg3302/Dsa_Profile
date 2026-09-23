class Solution:
    def findSpecialInteger(self, arr: list[int]) -> int:
        n = len(arr)
        mp = {}
        for i in arr:
            mp[i] = mp.get(i,0) + 1
        
        threshold = n // 4
        for key, count in mp.items():
            if count > threshold:
                return key
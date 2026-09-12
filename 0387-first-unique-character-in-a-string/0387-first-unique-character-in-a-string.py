class Solution:
    def firstUniqChar(self, s: str) -> int:
        mp = {}
        for ch in s:
            mp[ch] = mp.get(ch, 0) + 1
        
        mp1 = {}
        i = 0
        for ch in s:
            mp1[ch] = i
            i += 1

        for ch in s:
            if mp[ch] == 1:
                return mp1[ch]
                
        return -1 
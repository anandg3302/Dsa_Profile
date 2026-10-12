class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        longest = 0
        Set = set()
        for r in range(len(s)):
            while s[r] in Set:
                  Set.remove(s[l])
                  l = l + 1
            Set.add(s[r])
            longest = max(r-l+1,longest)
    
        return longest
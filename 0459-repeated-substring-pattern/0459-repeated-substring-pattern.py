class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        doub = s + s
        
        return s in doub[1:-1]
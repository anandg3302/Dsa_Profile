class Solution:
    def hasMatch(self, s: str, p: str) -> bool:
        left,right = p.split("*")

        i = s.find(left)
        if i == -1:
           return False
        
        j = s.find(right, i + len(left))


        return j != -1
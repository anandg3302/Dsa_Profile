class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
           return False
        mp = {}
        mp1 = {}
        i = 0
        while i < len(s):
              a = s[i]
              b = t[i]
              if a in mp and mp.get(a) != b:
                 return False
              if b in mp1 and mp1.get(b) != a:
                 return False
              
              mp[a] = b
              mp1[b] = a
              i += 1
        
        return True
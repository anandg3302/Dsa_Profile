class Solution:
    def evaluate(self, s: str, knowledge: list[list[str]]) -> str:
        k_map = {}
        for item in knowledge:
            key = item[0]
            val = item[1]
            k_map[key] = val
        
        res = []
        i = 0
        n = len(s)
        
        while i < n:
            if s[i] == '(':
                j = s.find(')', i)
                key = s[i + 1:j]
                res.append(k_map.get(key, '?'))
                i = j + 1
            else:
                res.append(s[i])
                i += 1
                
        return "".join(res)
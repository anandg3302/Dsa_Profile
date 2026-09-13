class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        max_len = 0
        mp = {}
        left = 0
        
        for i in range(len(fruits)):
            mp[fruits[i]] = mp.get(fruits[i], 0) + 1
            while len(mp) > 2:
                mp[fruits[left]] -= 1
                if mp[fruits[left]] == 0:
                    del mp[fruits[left]]
                left += 1
                
            max_len = max(max_len, i - left + 1)
            
        return max_len
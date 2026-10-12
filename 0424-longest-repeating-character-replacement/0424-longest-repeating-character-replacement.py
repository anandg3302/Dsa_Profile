class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count = {}
        left = 0
        max_fre = 0
        answer = 0

        for right , ch in enumerate(s):
            count[ch] = count.get(ch,0) + 1
            max_fre = max(max_fre,count[ch])

            while (right - left + 1) - max_fre > k:
                left_char = s[left]
                count[left_char] -= 1
                left += 1
            
            answer = max(answer,right - left + 1)
        
        return answer
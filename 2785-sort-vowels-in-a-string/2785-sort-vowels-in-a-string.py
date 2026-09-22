class Solution:
    def sortVowels(self, s: str) -> str:
        
        vowels = set("aeiouAEIOU")
        sorted_vowels = sorted([char for char in s if char in vowels])
        res = []
        vowel_idx = 0

        for char in s:
            if char in vowels:
                res.append(sorted_vowels[vowel_idx])
                vowel_idx += 1
            else:
                res.append(char)
                
        return "".join(res)
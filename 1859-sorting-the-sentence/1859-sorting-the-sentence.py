class Solution:
    def sortSentence(self, s: str) -> str:
    
        words = s.split()
        words.sort(key=lambda word: int(word[-1]))
        cleaned_words = [word[:-1] for word in words]
        
        return " ".join(cleaned_words)
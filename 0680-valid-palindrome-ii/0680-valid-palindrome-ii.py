class Solution:
    def validPalindrome(self, s: str) -> bool:
        s = list(s)
        i = 0
        j = len(s) - 1

        # helper function

        def is_palindrome(left, right):
            while left < right:
                if s[left] != s[right]:
                    return False
                left += 1
                right -= 1
            return True
            
       # main logic

        while i < j:
            if s[i] == s[j]:
                i += 1
                j -= 1
            else:
                return is_palindrome(i + 1, j) or is_palindrome(i, j - 1)

        return True
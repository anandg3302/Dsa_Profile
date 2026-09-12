class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        arr = []
        for num in nums:
            num1 = num * num
            arr.append(num1)
        
        arr.sort()
        return arr
class Solution:
    def sortPeople(self, names: list[str], heights: list[int]) -> list[str]:
        arr = []
        for i in range(len(names)):
            arr.append([heights[i],names[i]])

        arr.sort(reverse = True)

        return[person[1] for person in arr]
        
         
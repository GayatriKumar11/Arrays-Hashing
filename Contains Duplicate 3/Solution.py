// https://leetcode.com/problems/contains-duplicate

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        numsSet = set(nums)

        if len(nums) == len(numsSet):
            return False
        else:
            return True 

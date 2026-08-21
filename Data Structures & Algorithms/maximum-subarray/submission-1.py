class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currSub = nums[0]
        currSum = 0

        for n in nums:
            if currSum < 0:
                currSum = 0
            
            currSum += n
            currSub = max(currSub, currSum)

        return currSub
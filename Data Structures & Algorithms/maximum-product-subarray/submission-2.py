class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res = nums[0]
        currMax = currMin = 1

        for num in nums:
            tmp = currMax * num
            currMax = max(num, num * currMax, currMin * num)
            currMin = min(num, currMin * num, tmp)
            res = max(currMax, res)

        return res
        

# 2 -> max 2 min 1
# 4 -> max 8 min
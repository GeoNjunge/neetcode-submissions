class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        sub_dp = [1] * len(nums)

        for i in range(len(nums), -1, -1):
            for j in range(i + 1, len(nums)):
                if nums[j] > nums[i]:
                    sub_dp[i] = max(sub_dp[i], 1 + sub_dp[j])

        return max(sub_dp)  
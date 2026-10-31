class Solution:
    def search(self, nums: List[int], target: int) -> int:
        nums_len = len(nums) - 1

        l, r = 0, nums_len
        mid = l + (r - l)//2

        while l <= r:
            if target == nums[mid]:
                return mid
            elif target > nums[mid]:
                l = mid + 1
            elif target < nums[mid]:
                r = mid - 1
                
            mid = l + (r - l)//2

        return -1
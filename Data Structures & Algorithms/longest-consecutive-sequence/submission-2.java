class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;

        for (int num: nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int streakLength = 0;

            while (set.contains(curr)) {
                streakLength++;
                curr+=1;
            }

        res = Math.max(res, streakLength);
        }
        return res;
    }
}

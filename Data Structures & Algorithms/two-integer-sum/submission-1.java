class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                int index = map.get(complement);
                if (index == i) {
                    return new int[]{};
                }

                return new int[]{index, i};
            }
            map.put(nums[i], i);
        }
    return new int[]{};
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!res.containsKey(nums[i])) {
                res.put(nums[i], 1);
            }

            res.merge(nums[i], 1, Integer::sum);
        }

        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry: res.entrySet()) {
            if (entry.getValue() > (nums.length - 1)/2) {
                if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                    maxEntry = entry;
                }
            }
        }

        return maxEntry.getKey();
    }
}
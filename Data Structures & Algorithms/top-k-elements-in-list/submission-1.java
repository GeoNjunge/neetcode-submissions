class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            int count = entry.getValue();
            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(entry.getKey());
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && resultList.size() < k; i--) {
            if (bucket[i] != null) {
                resultList.addAll(bucket[i]);
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = resultList.get(i);
        }
        
        return res;
    }
}

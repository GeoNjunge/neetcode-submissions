class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        // heap based sorting
        PriorityQueue<Integer> heap =
            new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for (int num: freq.keySet()) {
            heap.add(num);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        //
        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = heap.poll();
        }

    return res;
    }
}

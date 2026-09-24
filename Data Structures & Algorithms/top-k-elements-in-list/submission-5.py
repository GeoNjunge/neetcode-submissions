class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:   
        map = {}
        for num in nums:
            map[num] = map.get(num, 0) + 1

        bucket = []
        for num, freq in map.items():
            bucket.append([freq, num])

        bucket.sort()

        res = []
        while len(res) < k:
            res.append(bucket.pop()[1])

        return res
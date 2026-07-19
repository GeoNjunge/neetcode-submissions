class MedianFinder:

    def __init__(self):
        self.max_tree = []
        self.min_tree = []

    def addNum(self, num: int) -> None:
        if not self.max_tree or num <= -self.max_tree[0]:
            heapq.heappush(self.max_tree, -num)
        else:
            heapq.heappush(self.min_tree, num)

        if len(self.max_tree) > len(self.min_tree) + 1:
            min_elem = -1 * heapq.heappop(self.max_tree)
            heapq.heappush(self.min_tree, min_elem)

        elif len(self.min_tree) > len(self.max_tree) + 1:
            max_elem = heapq.heappop(self.min_tree)
            heapq.heappush(self.max_tree, -max_elem)

    def findMedian(self) -> float:
        if len(self.max_tree) > len(self.min_tree):
            return -self.max_tree[0]

        elif len(self.min_tree) > len(self.max_tree):
            return self.min_tree[0]

        else:
            return (-self.max_tree[0] + self.min_tree[0])/2.0
        
        
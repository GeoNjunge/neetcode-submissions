class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = r - l;
            int area = width * Math.min(heights[l], heights[r]);

            max = Math.max(max, area);

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}

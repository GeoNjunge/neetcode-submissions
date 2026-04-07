class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[nums.length*2];
        int m = newArr.length;

        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
            newArr[n + i] = nums[i];
        }
        return newArr;
    }
}
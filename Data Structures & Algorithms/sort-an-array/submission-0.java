class Solution {

    public int[] sortArray(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        sort(nums, leftPointer, rightPointer);
        return nums;
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            nums[left + p] = temp[p];
        }
    }

    public void sort(int[] nums, int left, int right) {
        if (left >= right) return;   

        int mid = left + (right - left) / 2;

        sort(nums, left, mid);
        sort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }
}

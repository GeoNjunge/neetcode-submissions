class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prod = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int numProduct = 1;
            for (int j = 0; j < nums.length; j++) {
               if (j != i) {
                numProduct *= nums[j];
               } 
            }
            prod[i] = numProduct;
        }
        return prod;
    }
}  

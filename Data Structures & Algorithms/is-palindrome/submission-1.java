class Solution {
    public boolean isPalindrome(String s) {
        String cleanedS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int right = cleanedS.length() - 1;
        int left = 0;

        while (left < right) {
            if (cleanedS.charAt(left) != cleanedS.charAt(right)) return false;
            right--;
            left++;
        }

        return true;
    }
}

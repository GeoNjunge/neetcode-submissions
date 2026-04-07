class Solution {
    public boolean isPalindrome(String s) {
        String cleanedS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedS).reverse().toString();
        return reversed.equals(cleanedS);
    }
}

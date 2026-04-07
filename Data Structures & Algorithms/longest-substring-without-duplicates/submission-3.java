class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int ans = 0;

        if (s.length() == 1) return 1;

        while (r < s.length() && l < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;

                ans = Math.max(ans, r - l);
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return ans;
    }
}

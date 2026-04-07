class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String str: strs) {
            int[] freq = new int[26];
            for (char s: str.toCharArray()) {
                freq[s - 'a']++;
            }

            StringBuilder hash = new StringBuilder(2 * 26);
            for (int f: freq) hash.append(f).append("#");

            String key = hash.toString();
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}

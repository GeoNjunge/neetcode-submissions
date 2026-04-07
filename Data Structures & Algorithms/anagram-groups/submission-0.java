class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String str: strs) {
            int[] freq = new int[26];
            for (char s: str.toCharArray()) {
                freq[s - 'a']++;
            }
            String key = Arrays.toString(freq);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values(

        ));
    }
}

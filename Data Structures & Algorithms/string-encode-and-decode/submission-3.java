class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for (String strng: strs) {
            str.append(strng.length()).append("#").append(strng);
        }

        return new String(str);
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;

            while (j < str.length() && str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;

            res.add(str.substring(i, i + length));

            i += length;
        }
        return res;
    }
}


class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for (String string: strs) {
            str.append(string.length()).append("#").append(string);
        }

        return str.toString();
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

            i = i + length;
        }
        return res;
    }
}

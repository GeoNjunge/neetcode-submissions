
class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for (String string: strs) {
            str.append(string.length()).append("#").append(string);
        }

        String stringList = str.toString();

        byte[] byteArr = stringList.getBytes();

        return new String(byteArr);
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        byte[] recoveredBytes = str.getBytes();

        String recoveredString = new String(recoveredBytes);
        int n = recoveredString.length();

        int i = 0;
        while (i < n) {
            int j = i;

            while (j < n && recoveredString.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(recoveredString.substring(i, j));

            i = j + 1;

            res.add(recoveredString.substring(i, i + length));

            i = i + length;
        }
        return res;
    }
}

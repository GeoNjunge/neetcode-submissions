class Solution {
    public boolean containsAllChars(String substr, String target) {
        for (char c: target.toCharArray()) {
            int countT = 0;

            for (char ct: target.toCharArray()) {
                if (ct == c) countT++;
            }

            int countS = 0;

            for (char cs: substr.toCharArray()) {
                if (cs == c) countS++;
            }

            if (countS < countT) {
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        List<Character> map = new ArrayList<>();
        String minSubstr = "";
int shortestLength = Integer.MAX_VALUE;

        if (s.equals(t)) return s;

        if (s.contains(t)) return t;

        for (char c: t.toCharArray()) {
            map.add(c);
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substr = s.substring(i, j + 1);
                if (containsAllChars(substr, t)) {
                    if (containsAllChars(substr, t)) {
                        if (substr.length() < shortestLength) {
                            shortestLength = substr.length();
                            minSubstr = substr;
                        }
                    }
                }
            }
        }
        return minSubstr;
    }
}

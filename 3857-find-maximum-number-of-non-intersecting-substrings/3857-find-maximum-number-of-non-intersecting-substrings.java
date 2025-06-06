class Solution {
        public int maxSubstrings(String s) {
        int res = 0, n = s.length();
        Map<Character, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!pos.containsKey(c)) {
                pos.put(c, i);
            } else if (i - pos.get(c) + 1 >= 4) {
                res++;
                pos.clear();
            }
        }
        return res;
    }
}
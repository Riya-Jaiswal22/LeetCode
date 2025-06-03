class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];
        for (int[] shift : shifts) {
            int start = shift[0], end = shift[1], direction = shift[2];
            int delta = direction == 1 ? 1 : -1;
            diff[start] += delta;
            if (end + 1 < n) {
                diff[end + 1] -= delta;
            }
        }
        int[] prefix = new int[n];
        prefix[0] = diff[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + diff[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int original = s.charAt(i) - 'a';
            int shifted = (original + prefix[i]) % 26;
            if (shifted < 0) shifted += 26;
            sb.append((char)('a' + shifted));
        }
        return sb.toString();
    }
}

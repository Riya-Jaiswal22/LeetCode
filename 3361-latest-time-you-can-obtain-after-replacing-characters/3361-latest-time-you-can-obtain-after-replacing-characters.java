class Solution {
    public String findLatestTime(String s) {
        char[] t = s.toCharArray();
        if (t[0] == '?') {
            t[0] = (t[1] == '?' || t[1] <= '1') ? '1' : '0';
        }
        if (t[1] == '?') {
            t[1] = (t[0] == '1') ? '1' : '9';
        }
        if (t[3] == '?') {
            t[3] = '5';
        }
        if (t[4] == '?') {
            t[4] = '9';
        }
        return new String(t);
    }
}
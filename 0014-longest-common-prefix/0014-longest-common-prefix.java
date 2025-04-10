class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        int j = 0;
        StringBuilder res = new StringBuilder();
        boolean flag = true;

        while (true) {
            if (j >= strs[0].length()) break;
            char t = strs[0].charAt(j);

            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != t) {
                    flag = false;
                    break;
                }
            }

            if (!flag) break;

            res.append(t);
            j++;
        }

        return res.toString();
    }
}

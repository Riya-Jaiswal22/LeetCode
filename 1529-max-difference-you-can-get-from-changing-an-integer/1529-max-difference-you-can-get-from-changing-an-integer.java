class Solution {
    public int maxDiff(int num) {
        StringBuilder min = new StringBuilder(Integer.toString(num));
        StringBuilder max = new StringBuilder(Integer.toString(num));
        int i = 0;
        char ch;

        // MAX logic
        while (i < max.length() && max.charAt(i) == '9') i++;
        if (i != max.length()) {
            ch = max.charAt(i);
            for (int j = 0; j < max.length(); j++) {
                if (max.charAt(j) == ch) {
                    max.setCharAt(j, '9');
                }
            }
        }

        // MIN logic
        i = 0;
        if (min.charAt(0) != '1') {
            ch = min.charAt(0);
            for (int j = 0; j < min.length(); j++) {
                if (min.charAt(j) == ch) {
                    min.setCharAt(j, '1');
                }
            }
        } else {
            for (i = 1; i < min.length(); i++) {
                if (min.charAt(i) != '0' && min.charAt(i) != '1') {
                    ch = min.charAt(i);
                    for (int j = 1; j < min.length(); j++) {
                        if (min.charAt(j) == ch) {
                            min.setCharAt(j, '0');
                        }
                    }
                    break;
                }
            }
        }
        return Integer.parseInt(max.toString()) - Integer.parseInt(min.toString());
    }
}

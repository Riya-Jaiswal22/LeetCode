class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while (l1 >= 0 || l2 >= 0 || carry > 0) {
            if (l1 >= 0) {
                carry += a.charAt(l1) - '0';
                l1--;
            }
            if (l2 >= 0) {
                carry += b.charAt(l2) - '0';
                l2--;
            }
            res.append(carry % 2);
            carry /= 2;
        }
        return res.reverse().toString();
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> countStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append(ch);
            int lastIndex = sb.length() - 1;
            if (lastIndex > 0 && sb.charAt(lastIndex) == sb.charAt(lastIndex - 1)) {
                countStack.push(countStack.pop() + 1);
            } else {
                countStack.push(1);
            }
            if (countStack.peek() == k) {
                sb.delete(sb.length() - k, sb.length());
                countStack.pop();
            }
        }
        return sb.toString();
    }
}
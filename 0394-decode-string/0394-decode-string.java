class Solution {
    public String decodeString(String s) {
        int i = 0, n = s.length(), k;
        String res = "", t = "";
        Stack<String> st = new Stack<>();
        
        while (i < n) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) { 
                int numStart = i;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    i++;
                }
                st.push(s.substring(numStart, i)); 
                i--; 
                
            }
            else if (s.charAt(i) == ']') {  
                t = "";
                while (!st.peek().equals("[")) {  
                    t = st.pop() + t;
                }
                st.pop(); 
                k = Integer.parseInt(st.pop());  
                
                String temp = "";
                while (k > 0) {
                    temp += t;
                    k--;
                }
                st.push(temp); 
            } else {
                st.push(String.valueOf(ch));  
            }
            i++;
        }
        
        while (!st.isEmpty()) {
            res = st.pop() + res;
        }
        
        return res;
    }
}
class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int i = 0;
        
        while (i < chars.length) {
            int count = 1;
            int j = i;
            
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                i++;
                count++;
            }
            
            s.append(chars[j]);
            
            if (count > 1) {
                s.append(count);
            }
            
            i++;  
        }
        
        for (i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        
        return s.length();
    }
}

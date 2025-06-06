class Solution {
    public String robotWithString(String s) {
        Stack<Character> t = new Stack<>();
        StringBuilder res = new StringBuilder();
        int[] freq = new int[26];
        int i,idx=0;
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(i=0;i<s.length();i++){
            char c = s.charAt(i);
            t.push(c);
            freq[c-'a']--;
            while(idx<26 && freq[idx]==0) idx++;
            while(!t.isEmpty() && (t.peek()-'a')<=idx){
                res.append(t.pop());
            }
        }
        while(!t.isEmpty()) res.append(t.pop());
        return res.toString();
    }
}
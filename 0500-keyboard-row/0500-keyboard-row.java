class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        for(int i=0;i<words.length;i++){
            if(checkString(words[i],s1) || checkString(words[i],s2) || checkString(words[i],s3)){
                res.add(words[i]);
            }
        }
        return res.toArray(new String[0]);
    }
    public boolean checkString(String input, String s){
        for(char c : input.toCharArray()){
            if(s.indexOf(Character.toLowerCase(c))==-1) return false;
        }
        return true;
    }
}
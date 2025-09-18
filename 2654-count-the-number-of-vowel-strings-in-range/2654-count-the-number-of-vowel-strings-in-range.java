class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int vowelStrings(String[] words, int left, int right) {
        int i,n,res=0;
        for(i=left;i<=right;i++){
            n = words[i].length();
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(n-1))){
                res++;
            }
        }
        return res;
    }
}
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int res=0,i=0,n=text.length();
        while(i<n){
            boolean flag=true;
            while(i<n && text.charAt(i)!=' '){
                if(brokenLetters.indexOf(text.charAt(i)) != -1){
                    flag = false;
                }
                i++;
            }
            if(flag){
                res++;
            }
            i++;
        }
        return res;
    }
}
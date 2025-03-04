class Solution {
    public String reverseWords(String s) {
        s.trim();
        String res="";
        int i,j=0;
        for(i=0;i<s.length();i++){
            if(i!=0 && s.charAt(i-1)==' '){
                j=i;
            }
            if(i!=0 && s.charAt(i)==' ' && s.charAt(i-1)!=' ' ){
                res = s.substring(j,i+1) + res;
            }
            else if(i==s.length()-1){
                res = s.substring(j,i+1) + ' ' + res;
            }
        }
        return res.trim();
    }
}
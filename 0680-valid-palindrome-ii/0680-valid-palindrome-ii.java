class Solution {
    public boolean checkPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if(checkPalindrome(s,0,s.length()-1)==true){
            return true;
        }
        int i=0,j=s.length()-1,c=0;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return checkPalindrome(s, i + 1, j) || checkPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
}